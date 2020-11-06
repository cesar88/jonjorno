package com.joncorno.commons.util;

/**
 * Aktif pasif enum enum sınıfı.
 *
 * @author  Fatih Goken 
 */
public enum AktifPasifEnum {

    /**
     * Aktif aktif pasif enum.
     */
    AKTIF(1, "aktif.enum"),
    /**
     * Pasif aktif pasif enum.
     */
    PASIF(0, "pasif.enum"),
    /**
     * Silindi aktif pasif enum.
     */
    SILINDI(-1,"silindi.enum");

    /**
     * Key.
     */
    private int key;
    /**
     * Value.
     */
    private String value;

    /**
     * Yeni bir Aktif pasif enum sınıfı örneği oluşturur.
     *
     * @param key   key
     * @param value value
     */
    private AktifPasifEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * key alır.
     *
     * @return key
     */
    public int getKey() {
        return key;
    }

    /**
     * value alır.
     *
     * @return value
     */
    public String getValue() {
        return value;
    }


}