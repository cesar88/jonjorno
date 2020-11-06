package com.joncorno.commons.exception;

/**
 * Already exists exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class AlreadyExistsException extends ServiceException {

    /**
     * Yeni bir Already exists exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public AlreadyExistsException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }

    /**
     * Yeni bir Already exists exception sınıfı örneği oluşturur.
     *
     * @param customMessage custom message
     */
    public AlreadyExistsException(String customMessage) {
        super(customMessage);
    }
}
