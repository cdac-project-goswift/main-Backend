package com.goswift.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
user to send the token 
to the client side after successfuly login
token
user
*/
@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private UserDTO user;
}