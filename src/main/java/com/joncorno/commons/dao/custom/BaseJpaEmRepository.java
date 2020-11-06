package com.joncorno.commons.dao.custom;

import org.springframework.stereotype.Repository;

import com.joncorno.commons.entity.BaseEntity;

import java.util.List;

/**
 * Base jpa em repository interface sınıfı.
 *
 * @param <T> parametresi.
 * @author Fatih Göken 12/2019 Jpa Entity Manager Kaydet ve Güncelle işlemini Spring Data ya göre  çok daha hızlı yapmaktadır Sebebi: Spring Data kaydettikten ve güncelledikten sonra kaydettiği veya güncellediği entityleri select çekerken eagerly olarak fecth ettmektedir. Bu da çok fazla sorgu üreterek cost u yükseltmektedir. Base DAO da save ve saveAll methodu ezilememektedir. Spring Data Generic type larda override ve overload u kendi sorgusu olarak implement etmeye çalışmakta bu da no property for 'entity' found hatasına yol açmaktadır. JpaSimpleEntityManager ile baseentitymanager üretilmeye çalışıldığındada springdata factory sinde kendi entity manager ını inject ettiğinden performans değişmemektedir.
 */
@Repository
public interface BaseJpaEmRepository<T extends BaseEntity> {

    /**
     * Kaydet s.
     *
     * @param <S>    tipinde parametre.
     * @param entity entity
     * @return s
     */
    <S extends BaseEntity> S save(BaseEntity entity);

    /**
     * Kaydet liste list.
     *
     * @param <S>      tipinde parametre.
     * @param iterable iterable
     * @return list
     */
    <S extends T> List<S> kaydetListe(Iterable<S> iterable);


}
