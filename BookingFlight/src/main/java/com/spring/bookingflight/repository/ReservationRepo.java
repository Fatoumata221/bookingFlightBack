package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
