package com.scalefocus.Tsuite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalefocus.Tsuite.entity.User;
import com.scalefocus.Tsuite.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index() {
		//System.out.println(userService.createUser(new User("ivanka@abv.bg", "Ivanka", "pass")));
		return "index";
	}
}
