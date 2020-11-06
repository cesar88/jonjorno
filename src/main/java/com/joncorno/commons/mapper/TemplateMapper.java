package com.joncorno.commons.mapper;

import org.mapstruct.Mapper;

/**
 * Template mapper interface sınıfı.
 *
 * @param <T> parametresi.
 * @param <K> parametresi.
 */
@Mapper
public interface TemplateMapper<T, K> {

    /**
     * To entity t.
     *
     * @param dto dto
     * @return t
     */
    T toEntity(K dto);

    /**
     * To dto k.
     *
     * @param entity entity
     * @return k
     */
    K toDto(T entity);

}