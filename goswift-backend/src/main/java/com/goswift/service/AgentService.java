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
	public List<Booking> getAgencyBookings(Long userId);
	public void deleteSchedule(Long scheduleId);
	public Schedule updateSchedule(Long scheduleId, ScheduleRequest request);
	public List<Schedule> getMySchedules(Long userId);
	public Schedule addSchedule(Long userId, ScheduleRequest request);
	public void deleteBus(Long busId);
	public Bus updateBus(Long busId, BusRequest request);
	public List<Bus> getMyBuses(Long userId);
	public Bus addBus(Long userId, BusRequest request);
	public Agency getAgencyByUserId(Long userId) ;
	
}
