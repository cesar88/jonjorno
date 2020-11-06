package com.joncorno.commons.service.api;


import com.joncorno.commons.dto.BaseDTO;
import com.querydsl.core.types.Predicate;

import java.util.List;

/**
 * Base service interface sınıfı.
 *
 * @param <T> parametresi.
 */
public interface BaseService<T extends BaseDTO>{

    /**
     * Kaydet t.
     *
     * @param t t
     * @return t
     */
    T save(T t);

    /**
     * Guncelle t.
     *
     * @param t t
     * @return t
     */
    T update(T t);

    /**
     * Find all list.
     *
     * @return list
     */
    List<T> findAll();

    /**
     * Liste save list.
     *
     * @param ts ts
     * @return list
     */
    List<T> saveList(List<T> ts);

    /**
     * Find all by active list.
     *
     * @param active active
     * @return list
     */
    List<T> findAllByActive(Integer active);

    /**
     * Find all list.
     *
     * @param page page
     * @param size size
     * @return list
     */
    List<T> findAll(int page, int size);

    /**
     * Find all by active list.
     *
     * @param active active
     * @param page  page
     * @param size  size
     * @return list
     */
    List<T> findAllByActive(Integer active, int page, int size);

    /**
     * Find all list.
     *
     * @param predicate predicate
     * @param page      page
     * @param size      size
     * @return list
     */
    List<T> findAll(Predicate predicate, int page, int size);

    /**
     * Find by id t.
     *
     * @param id id
     * @return t
     */
    T findById(Long id);

    /**
     * Delete.
     *
     * @param t t
     */
    void delete(T t);

    /**
     * Count long.
     *
     * @return long
     */
    long count();

    /**
     * Count by active long.
     *
     * @param active active
     * @return long
     */
    long countByActive(Integer active);
}