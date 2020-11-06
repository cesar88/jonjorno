package com.joncorno.commons.exception;

/**
 * Kktc meb update exception sınıfı.
 */
public class UpdateException extends ServiceException {
    /**
     * Yeni bir Kktc meb update exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public UpdateException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
