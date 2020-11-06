package com.joncorno.commons.core;

/**
 * Operation enum enum sınıfı.
 */
public enum OperationEnum {

    /**
     * Equals operation enum.
     */
    EQUALS(0),
    /**
     * Equals ignore case operation enum.
     */
    EQUALS_IGNORE_CASE(1),
    /**
     * Like operation enum.
     */
    LIKE(2);

    /**
     * Key.
     */
    private int key;

    /**
     * Yeni bir Operation enum sınıfı örneği oluşturur.
     *
     * @param key key
     */
    OperationEnum(int key) {
        this.key = key;
    }

    /**
     * key alır.
     *
     * @return key
     */
    public int getKey() {
        return key;
    }
    
}
