package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketId;
    private String ticketName;
    private LocalDate createDate;
    private String modifiedBy;
    private String createdBy;
    private int amount;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "reservationId")
    private Flight flight;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "passengerId")
    private Passenger passenger;

    public Ticket(){
    }
}
