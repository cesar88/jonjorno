package com.joncorno.commons.exception;

/**
 * delete exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class DeleteException extends ServiceException {

    /**
     * Yeni bir Kktc meb delete exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public DeleteException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
