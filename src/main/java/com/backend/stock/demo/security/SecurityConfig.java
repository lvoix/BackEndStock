package com.backend.stock.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/api/**")
                .hasRole("USER")
                .antMatchers("/**")
                .hasRole("ADMIN").and()
                .csrf().disable().headers()
                .frameOptions().disable();
    }
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        //String password = passwordEncoder().encode("passcode");
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("user").password("passcode").roles("USER").and().withUser("admin").password("passcode").roles("USER", "ADMIN");
    }

    }


