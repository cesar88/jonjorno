package com.joncorno.commons.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Api error sınıfı.
 *
 * @author  Fatih Goken 
 */
public class ApiError implements Serializable {

    /**
     * Status.
     */
    private HttpStatus status;
    /**
     * Error message.
     */
    private String errorMessage;
    /**
     * Error code.
     */
    private String errorCode;
    /**
     * Debug message.
     */
    private String debugMessage;
    /**
     * Uid.
     */
    private String uid;
    /**
     * Timestamp.
     */
    private Timestamp timestamp;
    /**
     * Modul.
     */
    private String modul;
    /**
     * Rule.
     */
    private Boolean rule;
    /**
     * Access denied.
     */
    private Boolean accessDenied;

    /**
     * Yeni bir Api error sınıfı örneği oluşturur.
     */
    public ApiError() {

    }

    /**
     * Yeni bir Api error sınıfı örneği oluşturur.
     *
     * @param status status
     */
    ApiError(HttpStatus status) {
        this.status = status;
    }

    /**
     * Yeni bir Api error sınıfı örneği oluşturur.
     *
     * @param status status
     * @param ex     ex
     */
    ApiError(HttpStatus status, Throwable ex) {
        this.status = status;
        this.errorMessage = "Unexpected error";
        this.debugMessage = ex.getLocalizedMessage();
    }

    /**
     * Yeni bir Api error sınıfı örneği oluşturur.
     *
     * @param status  status
     * @param message message
     * @param ex      ex
     */
    ApiError(HttpStatus status, String message, Throwable ex) {
        this.status = status;
        this.errorMessage = message;
        this.debugMessage = ex.getLocalizedMessage();
    }

    /**
     * status alır.
     *
     * @return status
     */
    public HttpStatus getStatus() {
        return status;
    }

    /**
     * status set eder.
     *
     * @param status status
     */
    public void setStatus(HttpStatus status) {
        this.status = status;
    }


    /**
     * error message alır.
     *
     * @return error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * error message set eder.
     *
     * @param errorMessage error message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * error code alır.
     *
     * @return error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * error code set eder.
     *
     * @param errorCode error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * debug message alır.
     *
     * @return debug message
     */
    public String getDebugMessage() {
        return debugMessage;
    }

    /**
     * debug message set eder.
     *
     * @param debugMessage debug message
     */
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    /**
     * uid alır.
     *
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * uid set eder.
     *
     * @param uid uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * timestamp alır.
     *
     * @return timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * timestamp set eder.
     *
     * @param timestamp timestamp
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * modul alır.
     *
     * @return modul
     */
    public String getModul() {
        return modul;
    }

    /**
     * modul set eder.
     *
     * @param modul modul
     */
    public void setModul(String modul) {
        this.modul = modul;
    }

    /**
     * rule alır.
     *
     * @return rule
     */
    public Boolean getRule() {
        return rule;
    }

    /**
     * rule set eder.
     *
     * @param rule rule
     */
    public void setRule(Boolean rule) {
        this.rule = rule;
    }

    /**
     * access denied alır.
     *
     * @return access denied
     */
    public Boolean getAccessDenied() {
        return accessDenied;
    }

    /**
     * access denied set eder.
     *
     * @param accessDenied access denied
     */
    public void setAccessDenied(Boolean accessDenied) {
        this.accessDenied = accessDenied;
    }
}
