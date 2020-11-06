package com.joncorno.commons.exception;

/**
 * Kayit already exists exception sınıfı.
 */
public class RecordAlreadyExistsException extends ServiceException{
    /**
     * Yeni bir Kayit already exists exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public RecordAlreadyExistsException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
