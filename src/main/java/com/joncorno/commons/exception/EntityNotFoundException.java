package com.joncorno.commons.exception;

/**
 * Kktc meb entity not found exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class EntityNotFoundException extends ServiceException {

    /**
     * Yeni bir Kktc meb entity not found exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public EntityNotFoundException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
