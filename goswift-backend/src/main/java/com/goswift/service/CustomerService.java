package com.goswift.service;

import java.time.LocalDate;
import java.util.List;

import com.goswift.dto.BookingRequest;
import com.goswift.dto.FeedbackRequest;
import com.goswift.dto.SearchResultDTO;
import com.goswift.entity.Booking;
import com.goswift.entity.City;
import com.goswift.entity.Feedback;

public interface CustomerService 
{
	public boolean hasFeedback(Long bookingId) ;
	public List<String> getBookedSeats(Long scheduleId, LocalDate date);
	public Feedback addFeedback(FeedbackRequest request);
	public List<Booking> getUserBookings(Long userId, String type);
	public Booking createBooking(BookingRequest request);
	public List<SearchResultDTO> searchBuses(String source, String dest, LocalDate date, String busTypeStr, String sortBy);
	public List<City> getAllCities();
	
}
