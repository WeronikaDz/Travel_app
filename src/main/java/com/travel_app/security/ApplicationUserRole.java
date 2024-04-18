package com.travel_app.security;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import static com.travel_app.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    USER (Set.of(BUY_TRIP)),
    ADMIN (Set.of(ADD_TRIP, EDIT_TRIP, DELETE_TRIP));
    private final Set<ApplicationUserPermission> permissions;
    ApplicationUserRole (Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> authorities = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}