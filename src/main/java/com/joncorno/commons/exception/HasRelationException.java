package com.joncorno.commons.exception;

/**
 * Has relation exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class HasRelationException extends ServiceException {

    /**
     * Yeni bir Has relation exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public HasRelationException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
