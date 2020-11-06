package com.joncorno.commons.service.api;

import java.util.List;

import com.joncorno.commons.dto.BaseDTO;

/**
 * Base sorting service interface sınıfı.
 *
 * @param <T> parametresi.
 * @author  Fatih Goken 
 */
public interface BaseSortingService<T extends BaseDTO> {

    /**
     * Find all list.
     *
     * @param byField by field
     * @return list
     */
    List<T> findAll(String byField);

    /**
     * Find all by active list.
     *
     * @param byField by field
     * @param active   active
     * @return list
     */
    List<T> findAllByActive(String byField, Integer active);

}
