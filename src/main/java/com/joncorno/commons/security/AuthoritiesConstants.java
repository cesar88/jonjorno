package com.joncorno.commons.security;

/**
 * @author  Fatih Goken 
 */

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    /**
     * ADMIN constant.
     */
    public static final String ADMIN = "ROLE_ADMIN";

    /**
     * USER constant.
     */
    public static final String USER = "ROLE_USER";

    /**
     * ANONYMOUS constant.
     */
    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    /**
     * Yeni bir Authorities constants sınıfı örneği oluşturur.
     */
    private AuthoritiesConstants() {
    }
}
