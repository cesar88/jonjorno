package com.joncorno.commons.security;

/**
 * @author  Fatih Goken 
 */

/**
 * Application constants.
 */
public final class UserConstants {

    /**
     * LOGIN_REGEX constant.
     */
// Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_.@A-Za-z0-9-]*$";

    /**
     * SYSTEM_ACCOUNT constant.
     */
    public static final String SYSTEM_ACCOUNT = "system";
    /**
     * ANONYMOUS_USER constant.
     */
    public static final String ANONYMOUS_USER = "anonymoususer";
    /**
     * DEFAULT_LANGUAGE constant.
     */
    public static final String DEFAULT_LANGUAGE = "tr";

    /**
     * Yeni bir User constants sınıfı örneği oluşturur.
     */
    private UserConstants() {
    }
}
