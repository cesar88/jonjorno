package com.joncorno.commons.exception;

/**
 * Service unavailable exception sınıfı.
 */
public class ServiceUnavailableException extends ServiceException {

    /**
     * Yeni bir Service unavailable exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public ServiceUnavailableException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}