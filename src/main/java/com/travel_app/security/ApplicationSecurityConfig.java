package com.travel_app.security;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static com.travel_app.security.ApplicationUserRole.*;


@Configuration
@EnableWebSecurity // adnotacja, która określa, że klasa będzie będzie zawierała konfiguracje dla "Security"
@EnableGlobalMethodSecurity(prePostEnabled = true) // dzięki temu działają adnotacje nad endpointami
public class ApplicationSecurityConfig {

    private final PasswordEncoder passwordEncoder;

    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    // todo poprosić Jarka za tydzień o korektę tej metody aby rozszerzyć ja o dodatkowe funkcje PUT POST etc.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults())
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.GET, "management/alltrips").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
                                // tutaj filtrowanie
                        .anyRequest().permitAll()
//                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST, "/newtrips").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN") // tutaj filtrowanie
//                        .anyRequest().permitAll()
//                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.DELETE, "/deletetrips").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN") // tutaj filtrowanie
//                        .anyRequest().permitAll()
//                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.PUT, "/updatetrips").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN") // tutaj filtrowanie
//                        .anyRequest().permitAll() // wpuszczamy wszystkich pozostałych
                );
        // dodać kolejne requesty
        return http.build();
    }

    //zamiast configure mamy securityFilterChain
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests() // deklarujemy że zadania muszą byc autoryzowane
//                .antMatchers("/", "index") // część naszej białej listy
//                .permitAll()// kolejna część białej listy
//                .antMatchers("/api/**").hasRole(USER.name())
//                .anyRequest() // deklarujemy że każde zadanie
//                .authenticated() // musi przejść autentykację (klient podaje użytkownika i hasło)
//                .and()
//                .httpBasic(); // używamy podstawowej autentykacji
//    }

    // do wglądu
//    @Bean
//    protected UserDetailsService userDetailsService () {
//        UserDetails adminUser = User.builder()
//                .username("admin")
//                .password(passwordEncoder.encode("kochamywwycieczki"))
//                .authorities(ADMIN.getGrantedAuthorities())
//                .build();
//        UserDetails customerUser = User.builder()
//            .username("customer")
//            .password(passwordEncoder.encode("bardzochcejechaćnawakacje"))
//            .authorities(USER.getGrantedAuthorities())
//            .build();
//    return new InMemoryUserDetailsManager(adminUser, customerUser);
//}
    @Bean
    public UserDetailsManager userDetailsManager() {
        return new InMemoryUserDetailsManager();
    }
    @Bean
    protected InitializingBean initializingBean() {
        return () -> {
            UserDetails adminUser = User.builder()
                    .username("admin")
                    .password(passwordEncoder.encode("kochamywycieczki"))
                    .authorities(ADMIN.getGrantedAuthorities())
                    .build();
            userDetailsManager().createUser(adminUser);
            UserDetails customerUser = User.builder()
                    .username("customer")
                    .password(passwordEncoder.encode("bardzochcejechaćnawakacje"))
                    .authorities(USER.getGrantedAuthorities())
                    .build();
            userDetailsManager().createUser(customerUser);
        };
    }
}
