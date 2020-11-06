package com.joncorno.commons.exception;

/**
 * Kayit bulunamadi exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class RecordNotFoundException extends ServiceException {

    /**
     * Yeni bir Kayit bulunamadi exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public RecordNotFoundException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
