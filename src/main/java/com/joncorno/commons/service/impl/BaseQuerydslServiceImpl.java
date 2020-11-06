package com.joncorno.commons.service.impl;

import com.joncorno.commons.core.ResultOrderEnum;
import com.joncorno.commons.core.querydsl.FilterPredicateBuilder;
import com.joncorno.commons.core.querydsl.SearchCriteria;
import com.joncorno.commons.dao.api.BaseDAO;
import com.joncorno.commons.dao.api.BaseQuerydslDAO;
import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.dto.FilterDTO;
import com.joncorno.commons.entity.BaseEntity;
import com.joncorno.commons.exception.ServiceException;
import com.joncorno.commons.mapper.TemplateMapper;
import com.joncorno.commons.service.api.BaseQuerydslService;
import com.querydsl.core.types.dsl.EntityPathBase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * QueryDSL kullanarak filtreleme, pagination yapan servis sınıfı
 *
 * @param <T>  tipinde parametre
 * @param <E>  tipinde parametre
 * @param <Q>  tipinde parametre
 * @param <D>  tipinde parametre
 * @param <BQ> tipinde parametre
 * @param <M>  tipinde parametre
 */
public abstract class BaseQuerydslServiceImpl<T extends BaseDTO, E extends BaseEntity,
        Q extends EntityPathBase<E>, D extends BaseDAO<E>, BQ extends BaseQuerydslDAO<E, Q>, M extends TemplateMapper<E, T>>
        extends BaseServiceImpl<T, E, D, M>
        implements BaseQuerydslService<T> {

    /**
     * logger constant.
     */
    private static final Log logger = LogFactory.getLog(BaseQuerydslServiceImpl.class);

    /**
     * E class.
     */
    final Class<E> eClass;
    /**
     * Base query dsl dao.
     */
    protected BQ baseQueryDslDao;

    /**
     * Yeni bir Base querydsl service sınıfı örneği oluşturur.
     *
     * @param eClass          e class
     * @param baseDAO         base dao
     * @param baseQueryDslDao base query dsl dao
     * @param mapperClass     mapper class
     */
    public BaseQuerydslServiceImpl(Class<E> eClass, D baseDAO, BQ baseQueryDslDao, Class<M> mapperClass) {
        super(mapperClass, baseDAO);
        this.baseDAO = baseDAO;
        this.eClass = eClass;
        this.baseQueryDslDao = baseQueryDslDao;
        if (mapperClass.isInterface()) {
            this.mapper = Mappers.getMapper(mapperClass);
        } else {
            try {
                this.mapper = mapperClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                logger.error(e);
                throw new ServiceException();
            }
        }
    }

    /**
     * FilterDTO nesnesine filtrelenmek istenen alanlar liste olarak eklenerek gönderilir.
     * page ve size parametreleri null ise pagination yapmaz
     *
     * @param filterDTO filter dto
     * @return
     */
    @Override
    public List<T> findAllByFilter(FilterDTO filterDTO) {
        FilterPredicateBuilder<E> filterPredicateBuilder = new FilterPredicateBuilder<>(eClass);

        for (SearchCriteria criteria : filterDTO.getSearchCriteriaList()) {
            filterPredicateBuilder.with(criteria.getKey(), criteria.getOperation(), criteria.getValue());
        }

        Iterable<E> results = null;

        if (filterDTO.getPage() != null && filterDTO.getSize() != null) {
            Pageable pageable = PageRequest.of(filterDTO.getPage(), filterDTO.getSize());
            try {
                if (filterDTO.getSortField() != null && filterDTO.getSiralama().equals(ResultOrderEnum.DESCENDING.getKey()))
                    results = baseQueryDslDao.findAll(filterPredicateBuilder.build(),
                            PageRequest.of(filterDTO.getPage(), filterDTO.getSize(), Sort.by(Sort.Order.by(filterDTO.getSortField())).descending()));
                else if (filterDTO.getSortField() != null && filterDTO.getSiralama().equals(ResultOrderEnum.ASCENDING.getKey()))
                    results = baseQueryDslDao.findAll(filterPredicateBuilder.build(),
                            PageRequest.of(filterDTO.getPage(), filterDTO.getSize(), Sort.by(Sort.Order.by(filterDTO.getSortField())).ascending()));
                else
                    results = baseQueryDslDao.findAll(filterPredicateBuilder.build(), pageable);
            } catch (Exception ex) {
                logger.error(ex);
            }
        } else {
            try {
                results = baseQueryDslDao.findAll(filterPredicateBuilder.build());
            } catch (Exception ex) {
                logger.error(ex);
            }
        }

        if (results != null) {
            List<T> dersDTOList = new ArrayList<>();
            for (E e : results) {
                dersDTOList.add(mapper.toDto(e));
            }
            return dersDTOList;
        }

        return null;
    }

    /**
     * filtre sonucu dönecek objelerin sayısını döner
     *
     * @param filterDTO filter dto
     * @return
     */
    @Override
    public Long countByFilter(FilterDTO filterDTO) {
        Long count = 0L;

        FilterPredicateBuilder<E> filterPredicateBuilder = new FilterPredicateBuilder<>(eClass);

        for (SearchCriteria criteria : filterDTO.getSearchCriteriaList()) {
            filterPredicateBuilder.with(criteria.getKey(), criteria.getOperation(), criteria.getValue());
        }
        try {
            count = baseQueryDslDao.count(filterPredicateBuilder.build());
        } catch (Exception ex) {
            logger.error(ex);
        }
        return count;
    }
}
