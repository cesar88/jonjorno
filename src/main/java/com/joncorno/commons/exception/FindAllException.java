package com.joncorno.commons.exception;

/**
 * Find all exception sınıfı.
 *
 * @author  Fatih Goken 
 */
public class FindAllException extends ServiceException {

    /**
     * Yeni bir Find all exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public FindAllException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
