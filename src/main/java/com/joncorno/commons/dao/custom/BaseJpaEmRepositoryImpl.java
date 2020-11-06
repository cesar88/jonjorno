package com.joncorno.commons.dao.custom;

import org.springframework.transaction.annotation.Transactional;

import com.joncorno.commons.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Base jpa em repository sınıfı.
 *
 * @param <T> tipinde parametre
 */
public class BaseJpaEmRepositoryImpl<T extends BaseEntity> implements BaseJpaEmRepository<T> {

    /**
     * Em.
     */
    @PersistenceContext
    private EntityManager em;


    /**
     * Kaydet s.
     *
     * @param <S>    tipinde parametre.
     * @param entity entity
     * @return s
     */
    @Transactional
    public <S extends BaseEntity> S save(BaseEntity entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            em.flush();
        } else {
            entity = em.merge(entity);
        }
        return (S) entity;
    }

    /**
     * Kaydet liste list.
     *
     * @param <S>      tipinde parametre.
     * @param iterable iterable
     * @return list
     */
    @Transactional
    public <S extends T> List<S> kaydetListe(Iterable<S> iterable){
            List<S> savedEntityList = new ArrayList<>();
            for (Iterator<S> it = iterable.iterator(); it.hasNext(); ) {
                S entity = it.next();
                if (entity.getId() == null) {
                    em.persist(entity);
                    em.flush();
                } else {
                    entity = em.merge(entity);
                }
                savedEntityList.add(entity);
            }
            return savedEntityList;
    }
}
