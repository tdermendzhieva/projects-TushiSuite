package com.scalefocus.Tsuite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalefocus.Tsuite.dao.UserRepository;
import com.scalefocus.Tsuite.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User createUser(User user) {
		return userRepo.save(user);
	}
}
