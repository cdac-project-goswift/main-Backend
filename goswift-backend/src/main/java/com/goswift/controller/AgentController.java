package com.goswift.controller;

import com.goswift.dto.ApiResponse;
import com.goswift.dto.BusRequest;
import com.goswift.dto.ScheduleRequest;
import com.goswift.entity.Booking;
import com.goswift.entity.Bus;
import com.goswift.entity.City;
import com.goswift.entity.Schedule;
import com.goswift.service.AgentService;
import com.goswift.service.AdminService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agent")
@RequiredArgsConstructor
public class AgentController {

    private AgentService agentService;
    private AdminService adminService;

    // --- Fleet Management ---
   
}