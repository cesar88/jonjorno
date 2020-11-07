package com.joncorno.commons.controller;

import org.javers.core.Changes;
import org.javers.core.Javers;
import org.javers.core.diff.Diff;
import org.javers.core.diff.changetype.ValueChange;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.JqlQuery;
import org.javers.repository.jql.QueryBuilder;
import org.javers.shadow.Shadow;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.joncorno.commons.dao.api.BaseDAO;
import com.joncorno.commons.dto.AuditChangeDTO;
import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.entity.BaseEntity;
import com.joncorno.commons.exception.EntityNotFoundException;
import com.joncorno.commons.exception.ExceptionEnum;
import com.joncorno.commons.mapper.AuditLogDTOMapper;
import com.joncorno.commons.service.api.BaseService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Audit historysi gibi bilgilere erismek icin kullanilacak olan repository / controller sinifi
 *
 * @param <E> tipinde parametre
 * @param <R> tipinde parametre
 * @param <D> tipinde parametre
 * @param <S> tipinde parametre
 */
public abstract class BaseAuditRepositoryController<E extends BaseEntity, R extends BaseDAO<E>, D extends BaseDTO,
        S extends BaseService>
        extends BaseControllerImpl<D, S> {

    /**
     * Javers.
     */
    private Javers javers;

    /**
     * Dao.
     */
    private R dao;

    /**
     * Clazz.
     */
    private Class<E> clazz;

    /**
     * Yeni bir Base audit repository controller sınıfı örneği oluşturur.
     *
     * @param javers  javers
     * @param dao     dao
     * @param service service
     * @param clazz   clazz
     */
    public BaseAuditRepositoryController(Javers javers, R dao, S service, Class<E> clazz) {
        super(service);
        this.javers = javers;
        this.dao = dao;
        this.clazz = clazz;
    }


    /**
     * verilen obje id'sine gore o objenin audit gecmisini doner
     *
     * @param id id
     * @return
     */
    @GetMapping(path = "/changes/{id}")
    @PreAuthorize(value = "hasAuthority('LOG_GORUNTULE')")
    public ResponseEntity<Changes> getChanges(@PathVariable(value = "id") Long id) {
        try {
            Optional<E> optionalEntity = dao.findById(id);
            E entity;
            if (optionalEntity.isPresent()) {
                entity = optionalEntity.get();
            } else {
                throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
            }
            QueryBuilder jqlQuery = QueryBuilder.byInstance(entity);
            Changes changes = javers.findChanges(jqlQuery.build());
            return new ResponseEntity<>(changes, HttpStatus.OK);
        } catch (Exception ex) {
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

    }

    /**
     * snapshots alır.
     *
     * @return snapshots
     */
    @GetMapping("/snapshots")
    @PreAuthorize(value = "hasAuthority('LOG_GORUNTULE')")
    public String getSnapshots() {
        try {
            QueryBuilder jqlQuery = QueryBuilder.byClass(clazz);
            List<CdoSnapshot> snapshots = javers.findSnapshots(jqlQuery.build());
            return javers.getJsonConverter().toJson(snapshots);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }
    }

    /**
     * shadows alır.
     *
     * @param id id
     * @return shadows
     */
    @GetMapping("/shadows/{id}")
    @PreAuthorize(value = "hasAuthority('LOG_GORUNTULE')")
    public String getShadows(@PathVariable Long id) {
        try {
            Optional<E> optionalEntity = dao.findById(id);
            E entity;
            if (optionalEntity.isPresent()) {
                entity = optionalEntity.get();
            } else {
                throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
            }
            JqlQuery jqlQuery = QueryBuilder.byInstance(entity)
                    .withChildValueObjects().build();
            List<Shadow<E>> shadows = javers.findShadows(jqlQuery);
            return javers.getJsonConverter().toJson(shadows.get(0));
        } catch (Exception ex) {
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }


    }

    /**
     * difference alır.
     *
     * @param firstObjectId  first object id
     * @param secondObjectId second object id
     * @return difference
     */
    @GetMapping("/difference/{firstObjectId}/{secondObjectId}")
    @PreAuthorize(value = "hasAuthority('LOG_GORUNTULE')")
    public String getDifference(@PathVariable Long firstObjectId, @PathVariable Long secondObjectId) {
        try {
            Optional<E> firstOptionalEntity = dao.findById(firstObjectId);
            Optional<E> secondOptionalEntity = dao.findById(secondObjectId);
            E firstEntity;
            E secondEntity;
            if (firstOptionalEntity.isPresent() && secondOptionalEntity.isPresent()) {
                firstEntity = firstOptionalEntity.get();
                secondEntity = secondOptionalEntity.get();
                Diff diff = javers.compare(firstEntity, secondEntity);
                return diff.changesSummary();
            } else {
                return "";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

    }

    /**
     * Degisiklikleri getir response entity.
     *
     * @param entityId entity id
     * @return response entity
     */

    @GetMapping("/degisiklik/{entityId}")
    @PreAuthorize(value = "hasAuthority('LOG_GORUNTULE')")
    public ResponseEntity<List<AuditChangeDTO>> degisiklikleriGetir(@PathVariable(value = "entityId") Long entityId) {
        try {
            Optional<E> optionalEntity = dao.findById(entityId);
            E entity;
            if (optionalEntity.isPresent()) {
                entity = optionalEntity.get();
            } else {
                throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
            }
            QueryBuilder jqlQuery = QueryBuilder.byInstance(entity);
            Changes changes = javers.findChanges(jqlQuery.build());
            AuditLogDTOMapper auditLogDTOMapper = new AuditLogDTOMapper();
            return new ResponseEntity<>(changes.stream().map(change -> auditLogDTOMapper.changeToAudiChangeDTO((ValueChange) change)).collect(Collectors.toList()), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

    }

}
