package com.joncorno.commons.core;

import com.querydsl.core.types.Predicate;

/**
 * Base filter interface sınıfı.
 *
 * @param <T> parametresi.
 */
public interface BaseFilter<T> {
    /**
     * Build predicate.
     *
     * @param t t
     * @return predicate
     */
    Predicate build(T t);
}
