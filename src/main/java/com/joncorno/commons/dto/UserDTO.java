package com.joncorno.commons.dto;

import org.hibernate.annotations.Immutable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Kullanici immutable dto sınıfı.
 */
@Getter
@Setter
@Immutable
@NoArgsConstructor
public class UserDTO extends BaseDTO {

    /**
     * Yeni bir Kullanici immutable dto sınıfı örneği oluşturur.
     *
     * @param id id
     */
    public UserDTO(Long id) {
        setId(id);
    }

    /**
     * Adi.
     */
    private String name;
    /**
     * Soyadi.
     */
    private String surName;
    /**
     * Kullanici adi.
     */
    private String userName;
    /**
     * Aktif.
     */
    private boolean active;

}
