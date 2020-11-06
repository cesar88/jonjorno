package com.joncorno.commons.core.querydsl;

import com.joncorno.commons.entity.BaseEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.core.types.dsl.StringPath;

/**
 * Filter predicate sınıfı.
 *
 * @param <T> tipinde parametre
 */
public class FilterPredicate<T extends BaseEntity> {

    /**
     * Criteria.
     */
    private SearchCriteria criteria;

    /**
     * Yeni bir Filter predicate sınıfı örneği oluşturur.
     *
     * @param criteria criteria
     */
    public FilterPredicate(SearchCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * predicate alır.
     *
     * @param clazz clazz
     * @return predicate
     */
    public BooleanExpression getPredicate(Class<? extends T> clazz) {
        PathBuilder<T> entityPath = new PathBuilder<>(clazz, toCamelCase(clazz.getSimpleName()));

        if (isNumeric(criteria.getValue().toString())) {
            NumberPath<Integer> path = entityPath.getNumber(criteria.getKey(), Integer.class);
            int value = Integer.parseInt(criteria.getValue().toString());
            switch (criteria.getOperation()) {
                case FilterOperationConstants.EQUALS_OPERATION:
                    return path.eq(value);
                case FilterOperationConstants.GREATER_OR_EQUALS_OPERATION:
                    return path.goe(value);
                case FilterOperationConstants.LESS_OR_EQUALS_OPERATION:
                    return path.loe(value);
                case FilterOperationConstants.NOT_EQUALS_OPERATION:
                    return path.ne(value);
            }
        } else {
            StringPath path = entityPath.getString(criteria.getKey());
            if (criteria.getOperation().equalsIgnoreCase(FilterOperationConstants.EQUALS_OPERATION)) {
                return path.containsIgnoreCase(criteria.getValue().toString());
            }
            if (criteria.getOperation().equalsIgnoreCase(FilterOperationConstants.LIKE_OPERATION)) {
                return path.like('%'+criteria.getValue().toString()+'%');
            }
            if (criteria.getOperation().equalsIgnoreCase(FilterOperationConstants.NOT_EQUALS_OPERATION)) {
                return path.notEqualsIgnoreCase(criteria.getValue().toString());
            }
        }
        return null;
    }

    /**
     * Is numeric boolean.
     *
     * @param str str
     * @return boolean
     */
    public static boolean isNumeric(final String str) {
        try {
            Integer.parseInt(str);
        } catch (final NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * To camel case string.
     *
     * @param s s
     * @return string
     */
    public String toCamelCase(String s) {
        char[] charArray = s.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : charArray) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

}
