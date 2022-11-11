package com.spring.bookingflight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassengerDto {
    private Long PassengerId;
    private String fullName;
    private String email;

    private String userName;
    private String country;
    private String password;
    private String  phoneNumber;
}
