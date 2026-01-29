package com.goswift.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/*
will be used by agent to add the bus  
this will map to bus entity
registrationNo
busType
capacity
*/
@Data
public class BusRequest {
    @NotBlank
    private String registrationNo;
    
    @NotBlank
    private String busType; // "AC_SEATER" (String from UI)
    
    @NotNull
    private Integer capacity;
}