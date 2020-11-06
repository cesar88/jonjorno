package com.joncorno.commons.exception;

/**
 * Kktc meb cache exception sınıfı.
 */
public class CacheException extends ServiceException {

    /**
     * Yeni bir Kktc meb cache exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public CacheException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}