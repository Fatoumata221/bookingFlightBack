package com.spring.bookingflight.dto;
import com.spring.bookingflight.bean.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class TicketDto {
    private Long ticketId;
    private String ticketName;
    private String createDate;
    private String modifiedBy;
    private String createdBy;
    private int amount;
    private Flight flight;

}
