package com.cd.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity // Activate Spring Security
public class SecurityConfig {

    /**
     * Config user information
     * @return
     */
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("1210")
                .roles("ADMIN", "USER")
                .build();

        UserDetails user = User
                .withUsername("user")
                .password("{noop}1210")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

}
