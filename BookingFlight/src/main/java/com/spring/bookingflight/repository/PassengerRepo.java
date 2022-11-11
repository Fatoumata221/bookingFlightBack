package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Admin;
import com.spring.bookingflight.bean.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Long> {


   Passenger getPassengerByEmail(String email);

   Passenger findByEmailAndPassword(String email, String password);
}
