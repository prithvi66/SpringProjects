package com.customer.profile.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(value = "/login")
	public String login() {
		return "You have logged in";
	}
	
}
