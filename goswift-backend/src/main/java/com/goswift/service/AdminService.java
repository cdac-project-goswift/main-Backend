package com.goswift.service;

import java.util.List;

import com.goswift.dto.BookingDTO;
import com.goswift.dto.SystemConfigRequest;
import com.goswift.dto.SystemStatsDTO;
import com.goswift.dto.UserDTO;
import com.goswift.entity.Agency;
import com.goswift.entity.Booking;
import com.goswift.entity.Bus;
import com.goswift.entity.City;
import com.goswift.entity.SystemConfig;
import com.goswift.enums.UserStatus;

public interface AdminService {
	public SystemConfig updateConfig(SystemConfigRequest req);
	public SystemConfig getConfig();
	public BookingDTO toBookingDTO(Booking booking);
	public List<BookingDTO> searchBookings(Long agencyId, Long busId);
	public List<BookingDTO> getAllBookings();
	public List<Bus> getBusesByAgency(Long agencyId);
	public List<Agency> getAllAgencies();
	public SystemStatsDTO getSystemStats();
	public List<City> getAllCities();
	public City addCity(City city);
	public void updateUserStatus(long userId, UserStatus status);
	public List<UserDTO> getAllUsers();

}
