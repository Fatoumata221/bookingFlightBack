package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flight")
@Data
@AllArgsConstructor
public class        Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long FlightId;
    private int capacity;
    private String airlinName;
    private double distance;
    @Column(unique = true)
    private  String flightCode;
    private String destination ;

    @ManyToOne(cascade = CascadeType.ALL)
    private Reservation reservation;
    public Flight() {
    }
}
