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

    @Override
    public Bus addBus(Long userId, BusRequest request) {
        Agency agency = getAgencyByUserId(userId);
        return busRepository.save(Bus.builder()
                .agency(agency)
                .registrationNo(request.getRegistrationNo())
                .busType(BusType.valueOf(request.getBusType()))
                .capacity(request.getCapacity())
                .build());
    }
    @Override
    public List<Bus> getMyBuses(Long userId) {
        Agency agency = getAgencyByUserId(userId);
        return busRepository.findByAgency(agency);
    }

    @Override
    public Bus updateBus(Long busId, BusRequest request) {
        Bus bus = busRepository.findById(busId)
            .orElseThrow(() -> new RuntimeException("Bus not found"));
        
        bus.setRegistrationNo(request.getRegistrationNo());
        bus.setBusType(BusType.valueOf(request.getBusType()));
        bus.setCapacity(request.getCapacity());
        return busRepository.save(bus);
    }

    // --- Helper Method ---
    private com.goswift.entity.Agency getAgencyByUserId(Long userId) {
        return agencyRepository.findByOwner_UserId(userId)
                .orElseThrow(() -> new RuntimeException("Agency not found for this user"));
    }
    
}
