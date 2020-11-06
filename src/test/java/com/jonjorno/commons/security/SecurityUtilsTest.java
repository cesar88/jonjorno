package com.jonjorno.commons.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.joncorno.commons.entity.immutable.KullaniciImmutable;
import com.joncorno.commons.security.SecurityUtils;

import java.security.Principal;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
/**
 * @author Fatih Goken 
 */
@RunWith(MockitoJUnitRunner.class)
public class SecurityUtilsTest {

    @Test
    public void getCurrentUserLogin() {
        KullaniciImmutable kullaniciImmutable = new KullaniciImmutable();
        kullaniciImmutable.setId(1L);
        Optional<KullaniciImmutable> optionalKullaniciImmutable = SecurityUtils.getCurrentUserLogin();
        assertNotNull(optionalKullaniciImmutable);
    }

    @Test
    public void getCurrentUserName() {
        Optional<String> stringOptional = SecurityUtils.getCurrentUserName();
        assertNotNull(stringOptional);
    }

    @Test
    public void getCurrentUserJWT() {
        Optional<String> stringOptional = SecurityUtils.getCurrentUserJWT();
        assertNotNull(stringOptional);
    }

    @Test
    public void isAuthenticated() {
        assertFalse(SecurityUtils.isAuthenticated());
    }

    @Test
    public void isCurrentUserInRole() {
        assertFalse(SecurityUtils.isCurrentUserInRole("Authority"));
    }

    @Test
    public void getCurrentPrincipal() {
        Principal principal = ()-> "principal";
        Optional<String> stringOptional = SecurityUtils.getCurrentPrincipal(principal);
        assertNotNull(stringOptional);
    }
}