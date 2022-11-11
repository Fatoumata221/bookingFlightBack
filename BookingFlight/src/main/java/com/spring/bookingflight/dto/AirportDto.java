package com.spring.bookingflight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirportDto {
    private Long AiporId;
    private  String city;
    private String name ;
    private String postCode;
    private String street;
}
