package com.joncorno.commons.core;

/**
 * Siralama enum enum sınıfı.
 */
public enum ResultOrderEnum {

    /**
     * Ascending siralama enum.
     */
    ASCENDING(0),
    /**
     * Descending siralama enum.
     */
    DESCENDING(1);

    /**
     * Key.
     */
    private int key;

    /**
     * Yeni bir Siralama enum sınıfı örneği oluşturur.
     *
     * @param key key
     */
    ResultOrderEnum(int key) {
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
