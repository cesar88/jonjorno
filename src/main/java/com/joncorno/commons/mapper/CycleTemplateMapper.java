package com.joncorno.commons.mapper;

import org.mapstruct.BeforeMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Cycle template mapper interface sınıfı.
 *
 * @param <T> parametresi.
 * @param <K> parametresi.
 */
//Map edilecek classlari diamond operator icerisine yazin
//@Mapper annotationi ekleyin
//Cycle olan dto lar için kullanılmalıdır
public interface CycleTemplateMapper<T ,K > extends TemplateMapper<T,K> {

    /**
     * knownInstances constant.
     */
    Map<Object, Object> knownInstances = new IdentityHashMap<>();

    /**
     * mapped instance alır.
     *
     * @param <T>        tipinde parametre.
     * @param source     source
     * @param targetType target type
     * @return mapped instance
     */
    @BeforeMapping
    default <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
        return (T) knownInstances.get( source );
    }

    /**
     * Store mapped instance.
     *
     * @param source source
     * @param target target
     */
    @BeforeMapping
    default void storeMappedInstance(Object source, @MappingTarget Object target) {
        knownInstances.put( source, target );
    }

    /**
     * To dto k.
     *
     * @param entity entity
     * @return k
     */
    @InheritInverseConfiguration
    @Override
    K toDto(T entity);

}
