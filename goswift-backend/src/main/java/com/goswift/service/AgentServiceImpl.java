package com.goswift.service;

import com.goswift.dto.BusRequest;
import com.goswift.dto.ScheduleRequest;
import com.goswift.entity.*;
import com.goswift.enums.BusType;
import com.goswift.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService  {
    private final BusRepository busRepository;
    private final ScheduleRepository scheduleRepository;
    private final AgencyRepository agencyRepository;
    private final UserRepository userRepository;
    private final CityRepository cityRepository;
    private final BookingRepository bookingRepository;
    private final ModelMapper mapper;

    
}