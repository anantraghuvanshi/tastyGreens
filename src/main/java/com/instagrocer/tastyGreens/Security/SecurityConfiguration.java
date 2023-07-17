package com.instagrocer.tastyGreens.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((authorizeRequests) ->
                {
                    try {
                        authorizeRequests
                .requestMatchers("/catalog").permitAll()
                .requestMatchers("/admin/items").hasRole("ADMIN").and()
                .formLogin(withDefaults());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

                return http.build();
    }

}