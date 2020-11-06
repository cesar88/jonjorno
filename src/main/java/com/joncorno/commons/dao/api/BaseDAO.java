package com.joncorno.commons.dao.api;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.joncorno.commons.entity.BaseEntity;

import java.util.List;
import java.util.Optional;

/**
 * Base dao interface sınıfı.
 *
 * @param <T> parametresi.
 */
@NoRepositoryBean
public interface BaseDAO<T extends BaseEntity> extends JpaRepository<T, Long> {

    /**
     * Find all list.
     *
     * @return list
     */
    List<T> findAll();

    /**
     * Find all by active list.
     *
     * @param active active
     * @return list
     */
    List<T> findAllByActive(Integer active);

    /**
     * Find all page.
     *
     * @param pageable pageable
     * @return page
     */
    Page<T> findAll(Pageable pageable);

    /**
     * Find all by active page.
     *
     * @param active    active
     * @param pageable pageable
     * @return page
     */
    Page<T> findAllByActive(Integer active, Pageable pageable);

    /**
     * Find all list.
     *
     * @param byField by field
     * @return list
     */
    List<T> findAll(Sort byField);

    /**
     * Find all by active list.
     *
     * @param byField by field
     * @param active   active
     * @return list
     */
    List<T> findAllByActive(Sort byField, Integer active);

    /**
     * Find by id optional.
     *
     * @param id id
     * @return optional
     */
    Optional<T> findById(Long id);

    /**
     * Count by active long.
     *
     * @param active active
     * @return long
     */
    Long countByActive(Integer active);

}
