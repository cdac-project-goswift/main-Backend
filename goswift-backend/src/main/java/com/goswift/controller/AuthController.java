package com.goswift.controller;

import com.goswift.dto.ApiResponse;
import com.goswift.dto.JwtResponse;
import com.goswift.dto.LoginRequest;
import com.goswift.dto.SignupRequest;
import com.goswift.dto.UserDTO;
import com.goswift.entity.City;
import com.goswift.security.JwtUtil;
import com.goswift.service.CustomerService;
import com.goswift.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private UserService userService;
    private AuthenticationManager authManager;
    private JwtUtil jwtUtil;
    private CustomerService customerService;

       
     @PostMapping("/signup")
    public ResponseEntity<ApiResponse<UserDTO>> signup(@Valid @RequestBody SignupRequest request) {
        UserDTO user = userService.registerUser(request);
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "User registered", user));
    }

    // Public endpoint for cities (for home page)
    @GetMapping("/cities")
    public ResponseEntity<ApiResponse<List<City>>> getAllCities() {
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "Cities fetched", customerService.getAllCities()));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<JwtResponse>> login(@RequestBody LoginRequest request) {
        Authentication auth = new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword());
        auth = authManager.authenticate(auth);
        
        String token = jwtUtil.createToken(auth);
        UserDTO userDTO = userService.login(request.getEmail(), request.getPassword());
        
        JwtResponse jwtResponse = new JwtResponse(token, userDTO);
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "Login successful", jwtResponse));
    }
}