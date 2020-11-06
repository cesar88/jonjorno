package com.joncorno.commons.service.api;

import java.util.List;

import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.dto.FilterDTO;

/**
 * Base querydsl filter service interface sınıfı.
 *
 * @param <T> parametresi.
 */
public interface BaseQuerydslFilterService<T extends BaseDTO> {
    /**
     * Find all by filter list.
     *
     * @param filterDTO filter dto
     * @return list
     */
    List<T> findAllByFilter(FilterDTO filterDTO);

    /**
     * Count by filter long.
     *
     * @param filterDTO filter dto
     * @return long
     */
    Long countByFilter(FilterDTO filterDTO);
}
