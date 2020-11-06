package com.joncorno.commons.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Audit change dto sınıfı.
 */
@Getter
@Setter
@NoArgsConstructor
public class AuditChangeDTO implements Serializable {

    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = -2332048044778298450L;

    /**
     * Degisiklik tipi.
     */
    private String degisiklikTipi;

    /**
     * Entity adi.
     */
    private String entityAdi;

    /**
     * Entity id.
     */
    private Long entityId;

    /**
     * Audit commit metadata dto.
     */
    private AuditCommitMetadataDTO auditCommitMetadataDTO;

    /**
     * Degisen property adi.
     */
    private String degisenPropertyAdi;

    /**
     * Property degisiklik tipi.
     */
    private String propertyDegisiklikTipi;

    /**
     * Bir onceki degisiklik.
     */
    private String birOncekiDegisiklik; //left

    /**
     * Bir sonraki degisiklik.
     */
    private String birSonrakiDegisiklik; //right

}
