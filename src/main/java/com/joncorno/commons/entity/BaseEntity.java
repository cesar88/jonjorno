package com.joncorno.commons.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.joncorno.commons.entity.immutable.KullaniciImmutable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

/**
 * Base entity sınıfı.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseEntity {

    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Eklenme tarihi.
     */
    @Column(name = "eklenme_tarihi")
    @CreatedDate
    private Instant eklenmeTarihi = Instant.now();

    /**
     * Guncellenme tarihi.
     */
    @Column(name = "updatenme_tarihi")
    @LastModifiedDate
    private Instant updatenmeTarihi;

    /**
     * Active.
     */
    @Column(name = "active")
    private Integer active;

    /**
     * Son degistiren.
     */
    @LastModifiedBy
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "son_degistiren", referencedColumnName = "id")
    @JsonIgnore
    private KullaniciImmutable sonDegistiren;

    /**
     * Olusturan.
     */
    @CreatedBy
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "olusturan", referencedColumnName = "id", updatable = false)
    @JsonIgnore
    private KullaniciImmutable olusturan;

    /**
     * Version.
     */
    @Version
    //@Temporal(TemporalType.TIMESTAMP) //Date
    @Column(name = "version")
    private Integer version;

    /**
     * Yeni bir Base entity sınıfı örneği oluşturur.
     */
    protected BaseEntity() {
        id = null;
    }

    /**
     * updatenme tarihi set eder.
     */
    @PreUpdate
    public void setGuncellenmeTarihi() {
        this.updatenmeTarihi = Instant.now();
    }

    /**
     * Equals boolean.
     *
     * @param o o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    /**
     * Hash code int.
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}