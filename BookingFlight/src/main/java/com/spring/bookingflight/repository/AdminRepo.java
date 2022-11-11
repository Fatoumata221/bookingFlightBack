package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo  extends JpaRepository<Admin,Long> {

    Admin findByEmailAndPassword(String email, String password) ;
    Admin getAdminByEmail(String email);


}
