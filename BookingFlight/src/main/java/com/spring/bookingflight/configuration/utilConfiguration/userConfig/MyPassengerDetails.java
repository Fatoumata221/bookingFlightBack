package com.spring.bookingflight.configuration.utilConfiguration.userConfig;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.bean.Passenger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class MyPassengerDetails implements UserDetails {
    private Passenger passenger;

    public MyPassengerDetails(Passenger passenger) {
        this.passenger= passenger;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(passenger.getRole());
        return Arrays.asList(authority);
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return passenger.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return passenger.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }


}
