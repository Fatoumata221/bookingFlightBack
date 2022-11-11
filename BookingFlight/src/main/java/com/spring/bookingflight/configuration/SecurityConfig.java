package com.spring.bookingflight.configuration;

import com.spring.bookingflight.configuration.utilConfiguration.adminConfig.MyAdminDetailsService;
import com.spring.bookingflight.configuration.utilConfiguration.userConfig.MyPassengerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpHeaders;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService myAdminDetailsService;

    @Autowired
    private UserDetailsService myPassengerDetailsService;

    @Bean
    public UserDetailsService adminDetailsService(){
        return new MyAdminDetailsService();
    }

    @Bean
    public UserDetailsService passengerDetailsService(){
        return new MyPassengerDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(adminDetailsService());
        authProvider.setUserDetailsService(passengerDetailsService());

        return authProvider;
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.cors()
                .and().csrf().disable()
                .authorizeHttpRequests((authz) -> {
                    try{
                        authz
                                .anyRequest().permitAll()
                                .and()
                                .sessionManagement()
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                })
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth){
        try{
            auth.userDetailsService(myAdminDetailsService).passwordEncoder(passwordEncoder());
            auth.userDetailsService(myPassengerDetailsService).passwordEncoder(passwordEncoder());
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
