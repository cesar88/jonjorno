package com.joncorno.commons.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import com.joncorno.commons.entity.immutable.KullaniciImmutable;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Optional;

/**
 * @author  Fatih Goken 
 */

/**
 * Utility class for Spring Security.
 */
public final class SecurityUtils {

    /**
     * Logged in user name.
     */
    public String loggedInUserName;

    /**
     * PRINCIPAL constant.
     */
    private static final String PRINCIPAL = "principal";

    /**
     * Yeni bir Security utils sınıfı örneği oluşturur.
     */
    private SecurityUtils() {
    }

    /**
     * Get the login of the current user.
     *
     * @return the login of the current user
     */
    public static Optional<KullaniciImmutable> getCurrentUserLogin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        KullaniciImmutable kullaniciImmutable = new KullaniciImmutable();
        if (auth != null && auth instanceof OAuth2Authentication) {
            LinkedHashMap properties = (LinkedHashMap) (((OAuth2Authentication) auth).getUserAuthentication().getDetails());
            LinkedHashMap userProperties = new LinkedHashMap();
            try {
                if (!(properties.get(PRINCIPAL) instanceof String))
                    userProperties = (LinkedHashMap) properties.get(PRINCIPAL);
                else {
                    userProperties.put(PRINCIPAL, "service");
                    userProperties.put("id", -1);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            kullaniciImmutable.setId(((Integer) userProperties.get("id")).longValue());
            return Optional.ofNullable(kullaniciImmutable);
        }
        kullaniciImmutable.setId(-2L);
        return Optional.of(kullaniciImmutable);
    }

    /**
     * current user name alır.
     *
     * @return current user name
     */
    public static Optional<String> getCurrentUserName() {
        if (SecurityContextHolder.getContext() != null && SecurityContextHolder.getContext().getAuthentication() != null) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication instanceof OAuth2Authentication)
                return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
            else
                return Optional.ofNullable(UserConstants.SYSTEM_ACCOUNT);
        } else {
            return Optional.ofNullable(UserConstants.SYSTEM_ACCOUNT);
        }
    }

    /**
     * Get the JWT of the current user.
     *
     * @return the JWT of the current user
     */
    public static Optional<String> getCurrentUserJWT() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return Optional.ofNullable(securityContext.getAuthentication())
                .filter(authentication -> authentication.getCredentials() instanceof String)
                .map(authentication -> (String) authentication.getCredentials());
    }

    /**
     * Check if a user is authenticated.
     *
     * @return true if the user is authenticated, false otherwise
     */
    public static boolean isAuthenticated() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return Optional.ofNullable(securityContext.getAuthentication())
                .map(authentication -> authentication.getAuthorities().stream()
                        .noneMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(AuthoritiesConstants.ANONYMOUS)))
                .orElse(false);
    }

    /**
     * If the current user has a specific authority (security role).
     * <p>
     * The name of this method comes from the isUserInRole() method in the Servlet API
     *
     * @param authority the authority to check
     * @return true if the current user has the authority, false otherwise
     */
    public static boolean isCurrentUserInRole(String authority) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return Optional.ofNullable(securityContext.getAuthentication())
                .map(authentication -> authentication.getAuthorities().stream()
                        .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(authority)))
                .orElse(false);
    }

    /**
     * current principal alır.
     *
     * @param p p
     * @return current principal
     */
    public static Optional<String> getCurrentPrincipal(Principal p) {
        //SecurityContext securityContext = SecurityContextHolder.getContext();
        //OAuth2Authentication oauth = (OAuth2Authentication)securityContext.getAuthentication();
        //SecurityContext securityContext=SecurityContextHolder.MODE_INHERITABLETHREADLOCAL;
        return Optional.ofNullable(p.getName());
    }
}
