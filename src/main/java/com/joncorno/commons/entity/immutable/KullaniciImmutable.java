package com.joncorno.commons.entity.immutable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Kullanici immutable sınıfı.
 *
 * @author Fatih Goken
 */
@Entity
@Table(name = "\"kullanici\"", schema = "authzdb")
@Immutable
@NoArgsConstructor
@Getter
@Setter
public class KullaniciImmutable {

    /**
     * Id.
     */
    @Id
    private Long id;
    /**
     * Adi.
     */
    private String adi;
    /**
     * Soyadi.
     */
    private String soyadi;
    /**
     * Kullanici adi.
     */
    private String kullaniciAdi;
    /**
     * Aktif.
     */
    private boolean aktif;
}
