package com.joncorno.commons.exception;

/**
 * Kktc meb service exception sınıfı.
 *
 * @author  Fatih Goken   Base Exception class for Service Exceptions
 */
public class ServiceException extends RuntimeException {

    /**
     * Kktc meb exception enum.
     */
    protected ExceptionEnum kktcMebExceptionEnum;

    /**
     * Yeni bir Kktc meb service exception sınıfı örneği oluşturur.
     */
    public ServiceException() {

    }

    /**
     * Yeni bir Kktc meb service exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public ServiceException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum.getValue());
        this.kktcMebExceptionEnum = kktcMebExceptionEnum;
    }

    /**
     * Yeni bir Kktc meb service exception sınıfı örneği oluşturur.
     *
     * @param customMessage custom message
     */
    public ServiceException(String customMessage) {
        super(customMessage);
    }

    /**
     * kktc meb exception enum alır.
     *
     * @return kktc meb exception enum
     */
    public ExceptionEnum getKktcMebExceptionEnum() {
        return kktcMebExceptionEnum;
    }

}
