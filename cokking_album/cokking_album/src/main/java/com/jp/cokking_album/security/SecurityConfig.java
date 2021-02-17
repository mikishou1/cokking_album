package com.jp.cokking_album.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SpringSecurity認証設定
 * @author msm41
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication().withUser("user1").password("dummyuser")
            .roles("USER", "ADMIN");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "/login").permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

}
