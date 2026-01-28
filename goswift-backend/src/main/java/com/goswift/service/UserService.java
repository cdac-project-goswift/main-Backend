package com.goswift.service;

import com.goswift.dto.SignupRequest;
import com.goswift.dto.UserDTO;

public interface UserService {
	
	public UserDTO getUserProfile(Long userId);
	 public UserDTO updateProfile(Long userId, UserDTO dto);
	 public UserDTO login(String email, String password);
	 public UserDTO registerUser(SignupRequest request);
	 
}
