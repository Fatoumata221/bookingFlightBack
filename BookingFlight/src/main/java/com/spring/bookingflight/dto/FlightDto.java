package com.spring.bookingflight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightDto {
    private Long FlightId;
    private int capacity;
    private String airlinName;
    private double distance;
    private  String flightCode;
    private String destination ;
    private int  price;

}
