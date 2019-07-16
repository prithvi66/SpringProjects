package com.customer.profile.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.profile.common.JsonResponse;
import com.customer.profile.dao.UserManagementDAO;
import com.customer.profile.service.UserManagementService;

@Service
@SuppressWarnings({ "rawtypes" })
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserManagementDAO userManagementDAO;

	public JsonResponse testConnection() {
		JsonResponse response = new JsonResponse();
		try {
			boolean isSuccessful = userManagementDAO.testConnection();
			if (isSuccessful) {
				response.setStatusCode(200);
				response.setResponseMessage("Connection Successful");
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			response.setStatusCode(500);
			response.setResponseMessage("Could not connect to Database: " + e);
		}
		return response;
	}

	public JsonResponse validateUser(Map map) {
		JsonResponse response = new JsonResponse();
		try {
			
		} catch(Exception e) {
			
		}
		return null;
	}

	public JsonResponse registerUser(Map map) {
		
		return null;
	}

}
