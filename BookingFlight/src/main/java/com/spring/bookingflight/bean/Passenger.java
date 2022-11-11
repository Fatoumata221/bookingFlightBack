package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "passenger")
@AllArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PassengerId;
    private String fullName;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String  phoneNumber;

    @Column(unique = true)
    private String userName;
    private String country;

    @Column(unique = true)
    private String password;

    @OneToMany(cascade=CascadeType.DETACH)
    private List<Reservation > reservation;
    @OneToOne(cascade = CascadeType.ALL)
    private Ticket ticket;

    private String role="ROLE_PASSENGER";

    public Passenger() {
    }
}
