package com.joncorno.commons.exception;

/**
 * Erisim reddedildi exception sınıfı.
 *
 * @author Fatih Göken 09/2019
 */
public class AccesDeniedException extends ServiceException {

    /**
     * Yeni bir Erisim reddedildi exception sınıfı örneği oluşturur.
     *
     * @param kktcMebExceptionEnum kktc meb exception enum
     */
    public AccesDeniedException(ExceptionEnum kktcMebExceptionEnum) {
        super(kktcMebExceptionEnum);
    }

}
