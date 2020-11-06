package com.joncorno.commons.exception;

/**
 * Kktc meb business rule exception sınıfı.
 */
public class BusinessRuleException extends ServiceException {

    /**
     * Yeni bir Kktc meb business rule exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public BusinessRuleException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }
}
