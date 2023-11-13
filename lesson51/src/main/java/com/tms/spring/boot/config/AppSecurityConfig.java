package com.tms.spring.boot.config;

import com.tms.spring.boot.service.DBUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DBUserDetailService service;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/public").hasAuthority("read")
                .antMatchers("/private").hasAuthority("write")
                .and()
                .formLogin()
                    .loginProcessingUrl("/myLogin")
                    .usernameParameter("login")
                    .passwordParameter("password")
                .successHandler((request, response, authentication) -> {
                    response.sendRedirect("/home");
                })
                .and()
                .logout()
                .logoutUrl("/myLogout")
                .logoutSuccessHandler((request, response, authentication) -> {
                    request.getSession().invalidate();
                    response.sendRedirect("/home");
                });
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(service).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
}
