package com.joncorno.commons.exception;

/**
 * Kktc meb duplicate data exception sınıfı.
 */
public class DuplicateDataException extends ServiceException {
    /**
     * Yeni bir Kktc meb duplicate data exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public DuplicateDataException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
