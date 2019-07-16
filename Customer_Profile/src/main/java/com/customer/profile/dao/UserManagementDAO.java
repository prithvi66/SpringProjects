package com.customer.profile.dao;

import java.sql.SQLException;
import java.util.Map;

@SuppressWarnings({"rawtypes"})
public interface UserManagementDAO {

	public boolean validateUser(Map map) throws SQLException;
	
	public boolean registerUser(Map map) throws SQLException;
	
	public boolean testConnection() throws Exception;
}
