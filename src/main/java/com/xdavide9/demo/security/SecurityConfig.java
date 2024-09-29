package com.xdavide9.demo.security;

import com.xdavide9.demo.customer.CustomerUserDetailsService;
import com.xdavide9.demo.customer.Role;
import jakarta.servlet.DispatcherType;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecurityConfig {

    private final CustomerUserDetailsService customerUserDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .userDetailsService(customerUserDetailsService)
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll())
                .authorizeHttpRequests(auth -> auth
                        .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.ERROR).permitAll()
                        .requestMatchers("/css/**", "/js/**").permitAll()
                        .requestMatchers("/home").permitAll()
                        // define more granular permissions if needed just use roles for now
                        .requestMatchers("/cart/**").hasRole(Role.USER.name())  // todo create cart api
                        .requestMatchers("/api/**").hasRole(Role.ADMIN.name())
                        .anyRequest().denyAll())
                .build();

    }

    // customise login process even more with other beans Success/Failure handlers

}
