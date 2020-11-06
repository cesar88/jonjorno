package com.joncorno.commons.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.service.api.BaseService;

import java.util.List;

/**
 * Base controller sınıfı. Generic auth conrtol
 *
 * @param <D> tipinde parametre
 * @param <S> tipinde parametre
 * @author Fatih Goken 
 */
public abstract class BaseControllerImpl<D extends BaseDTO, S extends BaseService>
        implements BaseController<D> {

    /**
     * Base service.
     */
    protected S baseService;

    /**
     * Yeni bir Base controller sınıfı örneği oluşturur.
     *
     * @param baseService base service
     */
    protected BaseControllerImpl(S baseService) {
        this.baseService = baseService;
    }

    /**
     * Kaydet response entity.
     *
     * @param d d
     * @return response entity
     */
    @PostMapping(value = "/save")
    @Override
    @PreAuthorize(value = "hasRole('ROLE_ADMIN') or hasAuthority(#d.getClass().getSimpleName().toUpperCase(T(java.util.Locale).ENGLISH).substring(0,(#d.getClass().getSimpleName().indexOf('DTO'))) +'_KAYDET')")
    public ResponseEntity<D> save(@RequestBody D d) {
        return new ResponseEntity<>((D) baseService.save(d), HttpStatus.OK);
    }

    /**
     * Guncelle response entity.
     *
     * @param d d
     * @return response entity
     */
    @PutMapping(value = "/update")
    @Override
    @PreAuthorize(value = "hasRole('ROLE_ADMIN') or hasAuthority(#d.getClass().getSimpleName().toUpperCase(T(java.util.Locale).ENGLISH).substring(0,#d.getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_GUNCELLE')")
    public ResponseEntity<D> update(@RequestBody D d) {
        return new ResponseEntity<>((D) baseService.update(d), HttpStatus.OK);
    }

    /**
     * Find all response entity.
     *
     * @return response entity
     */
    @GetMapping(value = "/findAll")
    @Override
    @PostAuthorize(value = "hasRole('ROLE_ADMIN') or returnObject.body.isEmpty() or hasAuthority(returnObject.body.get(0).getClass().getSimpleName().substring(0,returnObject.body.get(0).getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_LISTELE')")
    public ResponseEntity<List<D>> findAll() {
        return new ResponseEntity<List<D>>(baseService.findAll(), HttpStatus.OK);
    }

    /**
     * Find all response entity.
     *
     * @param page page
     * @param size size
     * @return response entity
     */
    @GetMapping(value = "/findAll/{page}/{size}")
    @PostAuthorize(value = "hasRole('ROLE_ADMIN') or returnObject.body.isEmpty() or hasAuthority(returnObject.body.get(0).getClass().getSimpleName().substring(0,returnObject.body.get(0).getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_LISTELE')")
    @Override
    public ResponseEntity<List<D>> findAll(@PathVariable(value = "page") Integer page,
                                           @PathVariable(value = "size") Integer size) {
        return new ResponseEntity<List<D>>(baseService.findAll(page,size), HttpStatus.OK);
    }

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @return response entity
     */
    @GetMapping(value = "/findAllByActive/{active}")
    @Override
    @PostAuthorize(value = "hasRole('ROLE_ADMIN') or returnObject.body.isEmpty() or hasAuthority(returnObject.body.get(0).getClass().getSimpleName().substring(0,returnObject.body.get(0).getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_LISTELE')")
    public ResponseEntity<List<D>> findAllByActive(@PathVariable(value = "active") Integer active) {
        return new ResponseEntity<List<D>>(baseService.findAllByActive(active), HttpStatus.OK);
    }

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @param page  page
     * @param size  size
     * @return response entity
     */
    @GetMapping(value = "/findAllByActive/{active}/{page}/{size}")
    @Override
    @PostAuthorize(value = "hasRole('ROLE_ADMIN') or returnObject.body.isEmpty() or hasAuthority(returnObject.body.get(0).getClass().getSimpleName().substring(0,returnObject.body.get(0).getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_LISTELE')")
    public ResponseEntity<List<D>> findAllByActive(
            @PathVariable(value = "active") Integer active,
            @PathVariable(value = "page") Integer page,
            @PathVariable(value = "size") Integer size
    ) {
        return new ResponseEntity<List<D>>(baseService.findAllByActive(active, page, size), HttpStatus.OK);
    }

    /**
     * Find by id response entity.
     *
     * @param id id
     * @return response entity
     */
    @GetMapping(value = "/findById/{id}")
    @Override
    @PostAuthorize(value = "hasRole('ROLE_ADMIN')  or returnObject.body != null or hasAuthority(returnObject.body.getClass().getSimpleName().substring(0,returnObject.body.getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_LISTELE')")
    public ResponseEntity<D> findById(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>((D) baseService.findById(id), HttpStatus.OK);
    }

    /**
     * Delete.
     *
     * @param d d
     */
    @PostMapping(value = "/delete")
    @Override
    @PreAuthorize(value = "hasRole('ROLE_ADMIN') or hasAuthority(#d.getClass().getSimpleName().substring(0,#d.getClass().getSimpleName().indexOf('DTO')).toUpperCase(T(java.util.Locale).ENGLISH)+'_SIL')")
    public void delete(@RequestBody D d) {
        baseService.delete(d);
    }


    /**
     * Liste save response entity.
     *
     * @param d d
     * @return response entity
     */
    @PostMapping(path = "/saveList")
    @Override
    @PreAuthorize(value = "hasRole('ROLE_ADMIN') or hasAuthority(#d.get(0).getClass().getSimpleName().toUpperCase(T(java.util.Locale).ENGLISH).substring(0,(#d.get(0).getClass().getSimpleName().indexOf('DTO'))) +'_KAYDET')")
    public ResponseEntity<List<D>> saveList(@RequestBody List<D> d) {
        return new ResponseEntity<>((List<D>) baseService.saveList(d), HttpStatus.OK);
    }

    /**
     * Count response entity.
     *
     * @return response entity
     */
    @GetMapping(path = "/count")
    @Override
    public ResponseEntity<Long> count() {
        return new ResponseEntity<>(baseService.count(),HttpStatus.OK);
    }

    /**
     * Count by active response entity.
     *
     * @param active active
     * @return response entity
     */
    @GetMapping(path = "/countByActive/{active}")
    @Override
    public ResponseEntity<Long> countByActive(@PathVariable(value = "active") Integer active) {
        return new ResponseEntity<>(baseService.countByActive(active),HttpStatus.OK);
    }
}
