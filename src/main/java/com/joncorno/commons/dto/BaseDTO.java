package com.joncorno.commons.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.joncorno.commons.util.AktifPasifEnum;

/**
 * Base dto sınıfı.
 */
@Getter
@Setter
public abstract class BaseDTO implements Serializable {

    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = -6491891794184399836L;

    /**
     * Id.
     */
    private Long id;

    /**
     * Active.
     */
    private Integer active = AktifPasifEnum.AKTIF.getKey();

    /**
     * Son degistiren.
     */
    private UserDTO sonDegistiren;

    /**
     * Olusturan.
     */
    private UserDTO olusturan;

    /**
     * Version.
     */
    private Integer version = new Integer(0);

    /**
     * Eklenme tarihi.
     */
    private Instant eklenmeTarihi;

    /**
     * Yeni bir Base dto sınıfı örneği oluşturur.
     */
    protected BaseDTO() {
        id = null;
    }

    /**
     * Has valid id boolean.
     *
     * @return boolean
     */
    public boolean hasValidID() {
        return !(id == null || id == 0L);
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseDTO other = (BaseDTO) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
}
