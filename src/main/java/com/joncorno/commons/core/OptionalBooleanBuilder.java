package com.joncorno.commons.core;

import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.function.Function;

/**
 * Optional boolean builder sınıfı.
 */
public class OptionalBooleanBuilder {
    /**
     * Predicate.
     */
    private BooleanExpression predicate;

    /**
     * Yeni bir Optional boolean builder sınıfı örneği oluşturur.
     *
     * @param predicate predicate
     */
    public OptionalBooleanBuilder(BooleanExpression predicate) {
        this.predicate = predicate;
    }

    /**
     * Not null and optional boolean builder.
     *
     * @param <T>                tipinde parametre.
     * @param expressionFunction expression function
     * @param value              value
     * @return optional boolean builder
     */
    public <T> OptionalBooleanBuilder notNullAnd(Function<T, BooleanExpression> expressionFunction, T value) {
        if (value != null) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(value)));
        }
        return this;
    }

    /**
     * Not empty and optional boolean builder.
     *
     * @param expressionFunction expression function
     * @param value              value
     * @return optional boolean builder
     */
    public OptionalBooleanBuilder notEmptyAnd(Function<String, BooleanExpression> expressionFunction, String value) {
        if (!StringUtils.isEmpty(value)) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(value)));
        }
        return this;
    }

    /**
     * Not empty and optional boolean builder.
     *
     * @param <T>                tipinde parametre.
     * @param expressionFunction expression function
     * @param collection         collection
     * @return optional boolean builder
     */
    public <T> OptionalBooleanBuilder notEmptyAnd(Function<Collection<T>, BooleanExpression> expressionFunction, Collection<T> collection) {
        if (!CollectionUtils.isEmpty(collection)) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(collection)));
        }
        return this;
    }

    /**
     * Not zero and optional boolean builder.
     *
     * @param expressionFunction expression function
     * @param value              value
     * @return optional boolean builder
     */
    public OptionalBooleanBuilder notZeroAnd(Function<Integer, BooleanExpression> expressionFunction, int value) {
        if (value != 0) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(value)));
        }
        return this;
    }

    /**
     * Not zero integer and optional boolean builder.
     *
     * @param expressionFunction expression function
     * @param value              value
     * @return optional boolean builder
     */
    public OptionalBooleanBuilder notZeroIntegerAnd(Function<Integer, BooleanExpression> expressionFunction, Integer value) {
        if (value != null) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(value)));
        }
        return this;
    }

    /**
     * Not zero long and optional boolean builder.
     *
     * @param expressionFunction expression function
     * @param value              value
     * @return optional boolean builder
     */
    public OptionalBooleanBuilder notZeroLongAnd(Function<Long, BooleanExpression> expressionFunction, Long value) {
        if (value != null) {
            return new OptionalBooleanBuilder(predicate.and(expressionFunction.apply(value)));
        }
        return this;
    }

    /**
     * Build boolean expression.
     *
     * @return boolean expression
     */
    public BooleanExpression build() {
        return predicate;
    }
}
