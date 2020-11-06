package com.joncorno.commons.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * Enum data dto sınıfı.
 */
@Getter
@Setter
public class EnumDataDTO extends BaseDTO implements Serializable {

    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = 6556225669578614659L;
    /**
     * Id.
     */
    private Long id;
    /**
     * Code.
     */
    private String code;
    /**
     * Description tr.
     */
    private String descriptionTr;
    /**
     * Description eng.
     */
    private String descriptionEng;
    /**
     * Description.
     */
    private String description;
    /**
     * Lookup code.
     */
    private String lookupCode;
    /**
     * Goruntulenme sirasi.
     */
    private Integer goruntulenmeSirasi;

    /**
     * Yeni bir Enum data dto sınıfı örneği oluşturur.
     */
    public EnumDataDTO() {

    }

    /**
     * Yeni bir Enum data dto sınıfı örneği oluşturur.
     *
     * @param id          id
     * @param description description
     * @param code        code
     */
    public EnumDataDTO(Long id, String description, String code) {
        this.id = id;
        this.description = description;
        this.code = code;
    }

    /**
     * Yeni bir Enum data dto sınıfı örneği oluşturur.
     *
     * @param code           code
     * @param descriptionTr  description tr
     * @param descriptionEng description eng
     * @param description    description
     */
    public EnumDataDTO(String code, String descriptionTr, String descriptionEng, String description) {
        this.code = code;
        this.descriptionTr = descriptionTr;
        this.descriptionEng = descriptionEng;
        this.description = description;
    }

    /**
     * Yeni bir Enum data dto sınıfı örneği oluşturur.
     *
     * @param id             id
     * @param code           code
     * @param descriptionTr  description tr
     * @param descriptionEng description eng
     * @param description    description
     */
    public EnumDataDTO(Long id, String code, String descriptionTr, String descriptionEng, String description) {
        this.id = id;
        this.code = code;
        this.descriptionTr = descriptionTr;
        this.descriptionEng = descriptionEng;
        this.description = description;
    }

    /**
     * Yeni bir Enum data dto sınıfı örneği oluşturur.
     *
     * @param id                 id
     * @param code               code
     * @param descriptionTr      description tr
     * @param descriptionEng     description eng
     * @param description        description
     * @param goruntulenmeSirasi goruntulenme sirasi
     */
    public EnumDataDTO(Long id, String code, String descriptionTr, String descriptionEng, String description, Integer goruntulenmeSirasi) {
        this.id = id;
        this.code = code;
        this.descriptionTr = descriptionTr;
        this.descriptionEng = descriptionEng;
        this.description = description;
        this.goruntulenmeSirasi = goruntulenmeSirasi;
    }

    /**
     * id alır.
     *
     * @return id
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * id set eder.
     *
     * @param id id
     */
    @Override
    public void setId(Long id) {
        this.id = id;
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
        EnumDataDTO that = (EnumDataDTO) o;
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
