package com.joncorno.commons.core.querydsl;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Search criteria sınıfı.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Key.
     */
    private String key;
    /**
     * Operation.
     */
    private String operation;
    /**
     * Value.
     */
    private transient Object value;


}
