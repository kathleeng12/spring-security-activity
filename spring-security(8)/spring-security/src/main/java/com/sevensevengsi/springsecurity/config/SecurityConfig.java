package com.sevensevengsi.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Bean(name = "passwordEncoder")
        public PasswordEncoder getPasswordEncoder () {
            DelegatingPasswordEncoder delPasswordEncoder = (DelegatingPasswordEncoder) PasswordEncoderFactories
                    .createDelegatingPasswordEncoder();
            BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
            delPasswordEncoder.setDefaultPasswordEncoderForMatches(bcryptPasswordEncoder);
            return delPasswordEncoder;
        }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/page/manager").hasRole("MANAGER")
                .antMatchers("/page/admin").hasRole("ADMIN")
                .antMatchers("/page/owner").hasRole("OWNER")
                .antMatchers("/page/customer").hasRole("CUSTOMER")
                .and()
                .formLogin()
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/access-denied");
    }
}
