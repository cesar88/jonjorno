package com.joncorno.commons.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import com.joncorno.commons.core.querydsl.SearchCriteria;

/**
 * Filter dto sınıfı.
 */
@Data
public class FilterDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Search criteria list.
     */
    private List<SearchCriteria> searchCriteriaList;
    /**
     * Page.
     */
    private Integer page;
    /**
     * Size.
     */
    private Integer size;

    /**
     * Sort field.
     */
    private String sortField;
    /**
     * Siralama.
     */
    private Integer siralama; //asc , desc

    /**
     * Filter field hash map.
     */
    private HashMap<String,String> filterFieldHashMap = new HashMap<>();


    /**
     * Yeni bir Filter dto sınıfı örneği oluşturur.
     */
    public FilterDTO() {
        //default constructor
    }

}
