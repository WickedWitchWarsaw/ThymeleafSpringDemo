package com.wickedwitch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by ZuZ on 2017-01-31.
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] PUBLIC_MACHERS = {
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/images/**",
            "/",
            "/index/**",
            "/details/**",
            "/checkout",
            "/docheckout",
            "/login",
            "/logout"
    };


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().antMatchers(PUBLIC_MACHERS).permitAll()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/index").permitAll()
                .and().logout()
                .deleteCookies("remove")
                .invalidateHttpSession(true)
                .logoutUrl("/logout")
                .logoutSuccessUrl("/logout-success")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("qwerty").roles("ADMIN", "USER")
                .and().withUser("user").password("qwerty").roles("ADMIN");
    }

}
