package com.example.springsecsection1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
      http.authorizeHttpRequests((requests) -> requests.requestMatchers("/myAccount","myBalance","myBalance","/myLoans","myCards").authenticated()
              .requestMatchers("/notices","/contact","/error").permitAll());

//        http.formLogin((flc)->flc.disable());
//        http.httpBasic((hbc)->hbc.disable());
        http.httpBasic(withDefaults());
        http.formLogin(withDefaults());

        return http.build();
    }
}
