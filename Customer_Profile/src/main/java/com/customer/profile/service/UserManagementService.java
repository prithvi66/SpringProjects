package com.customer.profile.service;

import java.util.Map;

import com.customer.profile.common.JsonResponse;

@SuppressWarnings({"rawtypes"})
public interface UserManagementService {
	
	public JsonResponse validateUser(Map map);
	
	public JsonResponse registerUser(Map map);
	
	public JsonResponse testConnection();

}
