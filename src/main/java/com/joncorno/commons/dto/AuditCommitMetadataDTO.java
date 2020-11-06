package com.joncorno.commons.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Audit commit metadata dto sınıfı.
 */
@Getter
@Setter
@NoArgsConstructor
public class AuditCommitMetadataDTO implements Serializable {

    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = -5411275011126555771L;

    /**
     * Commit id.
     */
    private Long commitId;

    /**
     * Author.
     */
    private String author;

    /**
     * Commit date.
     */
    private LocalDate commitDate;

    /**
     * Commit date instant.
     */
    private Instant commitDateInstant;

    /**
     * Commit date formatter.
     */
    private String commitDateFormatter;

    /**
     * commit date formatter alır.
     *
     * @return commit date formatter
     */
    public String getCommitDateFormatter() {
        LocalDateTime commitDateTime = LocalDateTime.ofInstant(commitDateInstant, ZoneId.systemDefault());
        return DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm").format(commitDateTime);

    }
}
