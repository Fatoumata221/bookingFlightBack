package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo extends JpaRepository<Flight,Long> {
}
