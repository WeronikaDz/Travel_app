package com.travel_app.repository;

import com.travel_app.auth.ApplicationUser;
import com.travel_app.entity.ApplicationUserEntity;
import com.travel_app.security.ApplicationUserRole;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class MySqlApplicationUserDao  {

    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserRepository applicationUserRepository;

    public MySqlApplicationUserDao(PasswordEncoder passwordEncoder, ApplicationUserRepository applicationUserRepository) {
        this.passwordEncoder = passwordEncoder;
        this.applicationUserRepository = applicationUserRepository;
    }

    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        return applicationUserRepository
                .findAll()
                .stream()
                .map(this::mapEntityToModel).collect(Collectors.toList());
    }

    private ApplicationUser mapEntityToModel(ApplicationUserEntity entity) {
        return new ApplicationUser(
                entity.getUsername(),
                entity.getPassword(),
                entity.getAuthorities().stream()
                        .flatMap(authority -> ApplicationUserRole.valueOf(authority.getAuthority()).getGrantedAuthorities().stream())
                        .collect(Collectors.toSet()),
                entity.isAccountNonExpired(),
                entity.isAccountNonLocked(),
                entity.isCredentialsNonExpired(),
                entity.isEnabled()
        );
    }
}