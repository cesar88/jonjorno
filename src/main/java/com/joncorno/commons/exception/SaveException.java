package com.joncorno.commons.exception;

/**
 * Kktc meb save exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class SaveException extends ServiceException {

    /**
     * Yeni bir Kktc meb save exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public SaveException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
