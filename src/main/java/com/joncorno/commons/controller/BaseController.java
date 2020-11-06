package com.joncorno.commons.controller;

import org.springframework.http.ResponseEntity;

import com.joncorno.commons.dto.BaseDTO;

import java.util.List;

/**
 * Base controller interface sınıfı.
 *
 * @param <T> parametresi.
 * @author Fatih Goken 
 */
public interface BaseController<T extends BaseDTO> {
    /**
     * Kaydet response entity.
     *
     * @param t t
     * @return response entity
     */
    ResponseEntity<T> save(T t);

    /**
     * Guncelle response entity.
     *
     * @param t t
     * @return response entity
     */
    ResponseEntity<T> update(T t);

    /**
     * Find all response entity.
     *
     * @return response entity
     */
    ResponseEntity<List<T>> findAll();

    /**
     * Liste save response entity.
     *
     * @param ts ts
     * @return response entity
     */
    ResponseEntity<List<T>> saveList(List<T> ts);

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @return response entity
     */
    ResponseEntity<List<T>> findAllByActive(Integer active);

    /**
     * Find all response entity.
     *
     * @param page page
     * @param size size
     * @return response entity
     */
    ResponseEntity<List<T>> findAll(Integer page, Integer size);

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @param page  page
     * @param size  size
     * @return response entity
     */
    ResponseEntity<List<T>> findAllByActive(Integer active, Integer page, Integer size);

    /**
     * Find by id response entity.
     *
     * @param id id
     * @return response entity
     */
    ResponseEntity<T> findById(Long id);

    /**
     * Count response entity.
     *
     * @return response entity
     */
    ResponseEntity<Long> count();

    /**
     * Count by active response entity.
     *
     * @param active active
     * @return response entity
     */
    ResponseEntity<Long> countByActive(Integer active);

    /**
     * Delete.
     *
     * @param t t
     */
    void delete(T t);
}
