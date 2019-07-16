package com.customer.profile.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.profile.common.JsonResponse;
import com.customer.profile.service.UserManagementService;

@RestController
@SuppressWarnings({"rawtypes"})
public class LoginController {
	
	@Autowired
	private UserManagementService userManagementService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse login(@RequestBody Map map) {
		return userManagementService.validateUser(map);
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse signup(@RequestBody Map map) {
		return userManagementService.registerUser(map);
	}
	
	@RequestMapping(value = "/testConnection", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse testConnection() {
		return userManagementService.testConnection();	
	}
}
