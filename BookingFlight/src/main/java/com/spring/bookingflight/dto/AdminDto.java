package com.spring.bookingflight.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminDto {
    private  Long adminId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    private String email;
}
