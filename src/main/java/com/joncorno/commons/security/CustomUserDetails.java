package com.joncorno.commons.security;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Custom user details sınıfı.
 *
 * @author Fatih Göken  08/2019
 */
public class CustomUserDetails implements UserDetails, CredentialsContainer {

    /**
     * Id.
     */
    private Long id;
    /**
     * Rol list.
     */
    private Collection<String> rolList;
    /**
     * serialVersionUID constant.
     */
    private static final long serialVersionUID = 500L;
    /**
     * Password.
     */
    private String password;
    /**
     * Username.
     */
    private final String username;
    /**
     * Authorities.
     */
    private Set<GrantedAuthority> authorities;
    /**
     * Account non expired.
     */
    private final boolean accountNonExpired;
    /**
     * Account non locked.
     */
    private final boolean accountNonLocked;
    /**
     * Credentials non expired.
     */
    private final boolean credentialsNonExpired;
    /**
     * Enabled.
     */
    private final boolean enabled;
    /**
     * Kullanici turu.
     */
    private Integer kullaniciTuru;


    /**
     * Yeni bir Custom user details sınıfı örneği oluşturur.
     *
     * @param id                    id
     * @param username              username
     * @param password              password
     * @param enabled               enabled
     * @param accountNonExpired     account non expired
     * @param credentialsNonExpired credentials non expired
     * @param accountNonLocked      account non locked
     * @param authorities           authorities
     * @param rolList               rol list
     * @param kullaniciTuru         kullanici turu
     */
    public CustomUserDetails(Long id, String username, String password, boolean enabled,
                             boolean accountNonExpired, boolean credentialsNonExpired,
                             boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Collection<String> rolList, Integer kullaniciTuru) {
        if (username != null && !"".equals(username) && password != null) {
            this.username = username;
            this.password = password;
            this.enabled = enabled;
            this.accountNonExpired = accountNonExpired;
            this.credentialsNonExpired = credentialsNonExpired;
            this.accountNonLocked = accountNonLocked;
            this.authorities = authorities.stream().collect(Collectors.toSet());
            this.rolList = rolList;
            this.kullaniciTuru = kullaniciTuru;
            this.id = id;
        } else {
            throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
        }

    }

    /**
     * authorities alır.
     *
     * @return authorities
     */
    public Collection<GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    /**
     * password alır.
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * username alır.
     *
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Is enabled boolean.
     *
     * @return boolean
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Is account non expired boolean.
     *
     * @return boolean
     */
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    /**
     * Is account non locked boolean.
     *
     * @return boolean
     */
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    /**
     * Is credentials non expired boolean.
     *
     * @return boolean
     */
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    /**
     * Erase credentials.
     */
    public void eraseCredentials() {
        this.password = null;
    }

    /**
     * user roles alır.
     *
     * @return user roles
     */
    public Collection<String> getUserRoles() {
        return this.rolList;
    }

    /**
     * id alır.
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Equals boolean.
     *
     * @param o o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomUserDetails that = (CustomUserDetails) o;
        return username.equals(that.username);
    }

    /**
     * Hash code int.
     *
     * @return int
     */
    public int hashCode() {
        return this.username.hashCode();
    }

    /**
     * To string string.
     *
     * @return string
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("Username: ").append(this.username).append("; ");
        sb.append("Password: [PROTECTED]; ");
        sb.append("Enabled: ").append(this.enabled).append("; ");
        sb.append("AccountNonExpired: ").append(this.accountNonExpired).append("; ");
        sb.append("credentialsNonExpired: ").append(this.credentialsNonExpired).append("; ");
        sb.append("AccountNonLocked: ").append(this.accountNonLocked).append("; ");
        if (!this.authorities.isEmpty()) {
            sb.append("Granted Authorities: ");
            boolean first = true;
            Iterator var3 = this.authorities.iterator();

            while (var3.hasNext()) {
                GrantedAuthority auth = (GrantedAuthority) var3.next();
                if (!first) {
                    sb.append(",");
                }

                first = false;
                sb.append(auth);
            }
        } else {
            sb.append("Not granted any authorities");
        }

        return sb.toString();
    }

    /**
     * kullanici turu alır.
     *
     * @return kullanici turu
     */
    public Integer getKullaniciTuru() {
        return kullaniciTuru;
    }
}
