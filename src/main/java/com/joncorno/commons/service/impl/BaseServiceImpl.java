package com.joncorno.commons.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.joncorno.commons.dao.api.BaseDAO;
import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.entity.BaseEntity;
import com.joncorno.commons.exception.DeleteException;
import com.joncorno.commons.exception.EntityNotFoundException;
import com.joncorno.commons.exception.ExceptionEnum;
import com.joncorno.commons.exception.FindAllException;
import com.joncorno.commons.exception.RecordNotFoundException;
import com.joncorno.commons.exception.SaveException;
import com.joncorno.commons.exception.ServiceException;
import com.joncorno.commons.mapper.TemplateMapper;
import com.joncorno.commons.service.api.BaseService;
import com.joncorno.commons.service.api.BaseSortingService;
import com.querydsl.core.types.Predicate;

/**
 * Base service sınıfı.
 *
 * @param <T> tipinde parametre
 * @param <E> tipinde parametre
 * @param <D> tipinde parametre
 * @param <M> tipinde parametre
 * @author Fatih Goken 
 */
public abstract class BaseServiceImpl<T extends BaseDTO, E extends BaseEntity, D extends BaseDAO<E>,
        M extends TemplateMapper<E, T>> implements BaseService<T> {

    /**
     * logger constant.
     */
    private static final Log logger = LogFactory.getLog(BaseServiceImpl.class);

    /**
     * Mapper class.
     */
    final Class<M> mapperClass;
    /**
     * Base dao.
     */
    protected D baseDAO;

    /**
     * Em.
     */
    @PersistenceContext
    private EntityManager em;//save ve güncelle için jpa nın methodları performans olarak daha üstün olduğu için tercih edildi. Spring data
    //Save methodu kaydettikten sonra lazy alanları da fetch etmektedir.

    /**
     * Mapper.
     */
    protected M mapper;

    /**
     * Yeni bir Base service sınıfı örneği oluşturur.
     *
     * @param mapperClass mapper class
     * @param baseDAO     base dao
     */
    protected BaseServiceImpl(Class<M> mapperClass, D baseDAO) {
        this.mapperClass = mapperClass;
        if (mapperClass.isInterface()) {//MapStruct kullanılmayan activelar olabildiği için değiştirildi. Tüm yapılar MapStruct a geçirildiğinde Refactor Edilebilir.
            this.mapper = Mappers.getMapper(mapperClass);
        } else {
            try {
                this.mapper = mapperClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                logger.error(e);
                throw new ServiceException();
            }
        }
        this.baseDAO = baseDAO;
    }

    /**
     * base dao set eder.
     *
     * @param baseDAO base dao
     */
    public void setBaseDAO(D baseDAO) {
        this.baseDAO = baseDAO;
    }

    /**
     * Kaydet t.
     *
     * @param dto dto
     * @return t
     */
    @Override
    @Transactional
    public T save(T dto) {
        try {
            E entity = mapper.toEntity(dto);
            if (dto.getId() != null) {
                em.merge(entity);
            } else {
                em.persist(entity);
                em.flush();
            }
            dto = mapper.toDto(entity);
        } catch (Exception ex) {
            logger.error(ex);
            throw new SaveException(ExceptionEnum.SAVE_EXCEPTION);
        }
        return dto;
    }

    /**
     * Liste save list.
     *
     * @param dtos dtos
     * @return list
     */
    @Override
    @Transactional
    public List<T> saveList(List<T> dtos) {
        try {
            List<E> savedList = baseDAO.saveAll(dtos.stream().map(d -> mapper.toEntity(d)).collect(Collectors.toList()));
            dtos = savedList.stream().map(s -> mapper.toDto(s)).collect(Collectors.toList());
        } catch (Exception ex) {
            logger.error(ex);
            throw new SaveException(ExceptionEnum.SAVE_EXCEPTION);
        }
        return dtos;
    }

    /**
     * Guncelle t.
     *
     * @param dto dto
     * @return t
     */
    @Override
    @Transactional
    public T update(T dto) {
        Optional<E> optionalEntity;
        try {
            optionalEntity = baseDAO.findById(dto.getId());
        } catch (Exception ex) {
            logger.error(ex);
            throw new RecordNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }
        if (optionalEntity.isPresent()) {
            E entity = mapper.toEntity(dto);
            E updateEntity = optionalEntity.get();
            BeanUtils.copyProperties(entity, updateEntity);//gönderilen dto lara db den gelen entity ile farklılıkları değiştirip, partial update yapılmasını sağlar
            try {
                entity = em.merge(updateEntity);
                return mapper.toDto(entity);
            } catch (Exception ex) {
                logger.error(ex);
                throw new SaveException(ExceptionEnum.SAVE_EXCEPTION);
            }
        } else {
            throw new RecordNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }
    }

    /**
     * Find all list.
     *
     * @return list
     */
    @Override
    public List<T> findAll() {
        List<E> entityList;
        try {
            entityList = baseDAO.findAll();
        } catch (Exception ex) {
            logger.error(ex);
            throw new FindAllException(ExceptionEnum.FIND_ALL_EXCEPTION);
        }

        if (!entityList.isEmpty()) {
            return entityList.stream().map(e -> mapper.toDto(e)).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * Find all by active list.
     *
     * @param active active
     * @return list
     */
    @Override
    public List<T> findAllByActive(Integer active) {
        List<E> entityList;
        try {
            entityList = baseDAO.findAllByActive(active);
        } catch (Exception ex) {
            logger.error(ex);
            throw new FindAllException(ExceptionEnum.FIND_ALL_BY_DURUM_EXCEPTION);
        }

        if (!entityList.isEmpty()) {
            return entityList.stream().map(e -> mapper.toDto(e)).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * Find all list.
     *
     * @param page page
     * @param size size
     * @return list
     */
    @Override
    public List<T> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<E> entityList;
        try {
            entityList = baseDAO.findAll(pageable);
        } catch (Exception ex) {
            logger.error(ex);
            throw new FindAllException(ExceptionEnum.FIND_ALL_EXCEPTION);
        }
        if (entityList == null) {
            throw new RecordNotFoundException(ExceptionEnum.KAYIT_BULUNAMADI_EXCEPTION);
        } else
            return entityList.stream().map(entity -> mapper.toDto(entity))
                    .collect(Collectors.toList());
    }

    /**
     * Find all by active list.
     *
     * @param active active
     * @param page  page
     * @param size  size
     * @return list
     */
    @Override
    public List<T> findAllByActive(Integer active, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<E> entityList;
        try {
            entityList = baseDAO.findAllByActive(active, pageable);
        } catch (Exception ex) {
            logger.error(ex);
            throw new FindAllException(ExceptionEnum.FIND_ALL_EXCEPTION);
        }
        if (entityList == null) {
            throw new RecordNotFoundException(ExceptionEnum.KAYIT_BULUNAMADI_EXCEPTION);
        } else
            return entityList.stream().map(entity -> mapper.toDto(entity))
                    .collect(Collectors.toList());
    }

    /**
     * Delete.
     *
     * @param dto dto
     */
    @Override
    public void delete(T dto) {
        Optional<E> optionalEntity;
        try {
            optionalEntity = baseDAO.findById(dto.getId());
        } catch (Exception ex) {
            logger.error(ex);
            throw new RecordNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

        if (optionalEntity.isPresent()) {
            try {
                baseDAO.delete(optionalEntity.get());
            } catch (Exception ex) {
                logger.error(ex);
                throw new DeleteException(ExceptionEnum.DELETE_EXCEPTION);
            }
        } else {
            throw new RecordNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }
    }


    /**
     * Find by id t.
     *
     * @param id id
     * @return t
     */
    @Override
    public T findById(Long id) {
        Optional<E> optionalEntity;
        try {
            optionalEntity = baseDAO.findById(id);
        } catch (Exception ex) {
            logger.error(ex);
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

        if (optionalEntity.isPresent()) {
            return mapper.toDto(optionalEntity.get());
        } else {
            throw new EntityNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }

    }


    /**
     * Find all list.
     *
     * @param predicate predicate
     * @param page      page
     * @param size      size
     * @return list
     */
    @Override
    public List<T> findAll(Predicate predicate, int page, int size) {
        try {
            return findAll(predicate, page, size);
        } catch (Exception ex) {
            logger.error(ex);
            throw new RecordNotFoundException(ExceptionEnum.NOT_FOUND_EXCEPTION);
        }
    }

    /**
     * Count long.
     *
     * @return long
     */
    @Override
    public long count() {
        return baseDAO.count();
    }

    /**
     * Count by active long.
     *
     * @param active active
     * @return long
     */
    @Override
    public long countByActive(Integer active) {
        return baseDAO.countByActive(active);
    }
}
