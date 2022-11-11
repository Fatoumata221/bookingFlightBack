package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ReservationId;

    private Long numberOfPassenger;
    private LocalDate reservationDate;
    private String state;
    private LocalTime departureTime;
    private String comeFrom;
    private String goTo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Passenger passenger;


}
