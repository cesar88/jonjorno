package com.joncorno.commons.core.querydsl;

import com.joncorno.commons.entity.BaseEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Filter predicate builder sınıfı.
 *
 * @param <T> tipinde parametre
 */
public class FilterPredicateBuilder<T extends BaseEntity> {

    /**
     * Params.
     */
    private List<SearchCriteria> params;

    /**
     * Clazz.
     */
    private Class<T> clazz;

    /**
     * Yeni bir Filter predicate builder sınıfı örneği oluşturur.
     *
     * @param clazz clazz
     */
    public FilterPredicateBuilder(Class<? extends T> clazz) {
        params = new ArrayList<>();
        this.clazz = (Class<T>) clazz;
    }

    /**
     * With filter predicate builder.
     *
     * @param key       key
     * @param operation operation
     * @param value     value
     * @return filter predicate builder
     */
    public FilterPredicateBuilder with(
            String key, String operation, Object value) {

        params.add(new SearchCriteria(key, operation, value));
        return this;
    }

    /**
     * Build boolean builder.
     *
     * @return boolean builder
     */
    public BooleanBuilder build() {
        if (params.isEmpty()) {
            return null;
        }

        List predicates = params.stream().map(param -> {
            FilterPredicate predicate = new FilterPredicate(param);
            return predicate.getPredicate(clazz);
        }).filter(Objects::nonNull).collect(Collectors.toList());

        BooleanBuilder result = new BooleanBuilder();
        for (Object predicate : predicates) {
            result.and((Predicate) predicate);
        }
        return result;
    }

    /**
     * Boolean expression wrapper sınıfı.
     */
    static class BooleanExpressionWrapper {

        /**
         * Result.
         */
        private BooleanExpression result;

        /**
         * Yeni bir Boolean expression wrapper sınıfı örneği oluşturur.
         *
         * @param result result
         */
        public BooleanExpressionWrapper(final BooleanExpression result) {
            super();
            this.result = result;
        }

        /**
         * result alır.
         *
         * @return result
         */
        public BooleanExpression getResult() {
            return result;
        }

        /**
         * result set eder.
         *
         * @param result result
         */
        public void setResult(BooleanExpression result) {
            this.result = result;
        }
    }

}
