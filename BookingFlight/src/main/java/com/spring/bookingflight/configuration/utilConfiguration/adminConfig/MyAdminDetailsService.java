package com.spring.bookingflight.configuration.utilConfiguration.adminConfig;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyAdminDetailsService implements UserDetailsService {
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public MyAdminDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Admin admin = adminRepo.getAdminByEmail(email);
        if(admin != null) {
            return new MyAdminDetails(admin);
        }else {
            throw new UsernameNotFoundException("Could not find user");
        }
    }
}
