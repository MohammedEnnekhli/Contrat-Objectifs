package com.sounhalazoun.contrat_objectif.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure( HttpSecurity http ) throws Exception {

        http.csrf().disable()
                // don't create session
                .sessionManagement().sessionCreationPolicy( SessionCreationPolicy.STATELESS )
                .and()
                .authorizeRequests()
                .antMatchers( HttpMethod.POST,"/gestionnaires","/evaluations")
                .hasAuthority( "ADMIN" )
                .anyRequest().authenticated()
                .and()
                .addFilterBefore( new JWTAuthorizationFilter(),
                        UsernamePasswordAuthenticationFilter.class );

    }

}
