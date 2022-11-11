package com.spring.bookingflight.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "airport")
@Data
@AllArgsConstructor
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AiporId;
    private  String city;
    private String name ;
    private String postCode;
    private String street;

    public Airport() {
    }
}
