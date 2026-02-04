package com.goswift.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;
/*
All the data map from user entity 
used for booking the bus
this will map to booking entity  
userId 
scheduleId
journeyDate
passengers
*/
@Data
public class BookingRequest {
    private Long userId;        
    private Long scheduleId;    
    private LocalDate journeyDate;
    private List<PassengerDTO> passengers;
}