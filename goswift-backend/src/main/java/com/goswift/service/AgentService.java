package com.goswift.service;

import java.util.List;

import com.goswift.dto.BusRequest;
import com.goswift.dto.ScheduleRequest;
import com.goswift.entity.Agency;
import com.goswift.entity.Booking;
import com.goswift.entity.Bus;
import com.goswift.entity.Schedule;

public interface AgentService 
{
	
	public Bus updateBus(Long busId, BusRequest request);
	public List<Bus> getMyBuses(Long userId);
	public Bus addBus(Long userId, BusRequest request);
	
	
}
