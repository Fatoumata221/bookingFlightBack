package com.spring.bookingflight.dto;

import com.spring.bookingflight.bean.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
    private Long ReservationId;
    private Long numberOfPassenger;
    private String reservationDate;
    private String state;
    private String departureTime;
    private String comeFrom;
    private String goTO;

    private long passengerId;
}
