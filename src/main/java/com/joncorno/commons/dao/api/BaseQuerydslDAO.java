package com.joncorno.commons.dao.api;

import com.joncorno.commons.entity.BaseEntity;
import com.querydsl.core.types.EntityPath;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

/**
 * Base querydsl dao interface sınıfı.
 *
 * @param <T> parametresi.
 * @param <Q> parametresi.
 */
public interface BaseQuerydslDAO<T extends BaseEntity, Q extends EntityPath<T>> extends JpaRepository<T, Long>, QuerydslPredicateExecutor<T>,
        QuerydslBinderCustomizer<Q> {

    /**
     * Customize.
     *
     * @param bindings bindings
     * @param root     root
     */
    default void customize(
            QuerydslBindings bindings, Q root) {
    }


}
