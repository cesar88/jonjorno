package com.joncorno.commons.core.querydsl;

/**
 * Filter operation constants sınıfı.
 */
public class FilterOperationConstants {

    /**
     * EQUALS_OPERATION constant.
     */
    public static final String EQUALS_OPERATION = ":";
    /**
     * GREATER_OR_EQUALS_OPERATION constant.
     */
    public static final String GREATER_OR_EQUALS_OPERATION = ">";
    /**
     * LESS_OR_EQUALS_OPERATION constant.
     */
    public static final String LESS_OR_EQUALS_OPERATION = "<";
    /**
     * LIKE_OPERATION constant.
     */
    public static final String LIKE_OPERATION = "like";
    /**
     * NOT_EQUALS_OPERATION constant.
     */
    public static final String NOT_EQUALS_OPERATION = "!:";

    /**
     * Yeni bir Filter operation constants sınıfı örneği oluşturur.
     */
    private FilterOperationConstants() {
        //default constructor
    }

}
