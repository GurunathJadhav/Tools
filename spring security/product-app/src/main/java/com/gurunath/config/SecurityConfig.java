package com.gurunath.config;

import com.gurunath.security.AppSecurityEndPoints;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private AppSecurityEndPoints appSecurityEndPoints;

    public SecurityConfig(AppSecurityEndPoints appSecurityEndPoints) {
        this.appSecurityEndPoints = appSecurityEndPoints;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       return httpSecurity.csrf(c->c.disable())
                .authorizeHttpRequests(auth->
                        auth.requestMatchers(appSecurityEndPoints.PUBLIC_END_POINTS)
                                .permitAll()
                                .anyRequest()
                                .authenticated()).build();
    }

}
