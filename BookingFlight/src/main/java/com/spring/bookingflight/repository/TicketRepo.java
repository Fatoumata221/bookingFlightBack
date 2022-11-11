package com.spring.bookingflight.repository;

import com.spring.bookingflight.bean.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Long> {
}
