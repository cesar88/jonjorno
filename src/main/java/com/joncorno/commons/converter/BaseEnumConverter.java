package com.joncorno.commons.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Base enum converter sınıfı.
 *
 * @param <T> tipinde parametre
 */
@Converter
public abstract class BaseEnumConverter<T extends Enum<T> & BaseEnum> implements AttributeConverter<T, Integer> {
    /**
     * Clazz.
     */
    private final Class<T> clazz;

    /**
     * Yeni bir Base enum converter sınıfı örneği oluşturur.
     *
     * @param clazz clazz
     */
    public BaseEnumConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    /**
     * Convert to database column integer.
     *
     * @param attribute attribute
     * @return integer
     */
    @Override
    public Integer convertToDatabaseColumn(T attribute) {
        return attribute != null ? attribute.getKey() : null;
    }

    /**
     * Convert to entity attribute t.
     *
     * @param key key
     * @return t
     */
    @Override
    public T convertToEntityAttribute(Integer key) {
        T[] enums = clazz.getEnumConstants();

        for (T e : enums) {
            if (key != null && e.getKey() == key) {
                return e;
            }
        }

        return null;
    }
}