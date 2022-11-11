package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends JpaRepository<Airport,Long>{


}
