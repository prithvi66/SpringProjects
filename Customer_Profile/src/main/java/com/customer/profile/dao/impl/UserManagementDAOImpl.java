package com.customer.profile.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.customer.profile.dao.UserManagementDAO;

@Repository
@SuppressWarnings({"rawtypes"})
public class UserManagementDAOImpl implements UserManagementDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	public boolean testConnection() throws Exception {
		try {
			Connection conn = dataSource.getConnection();
			if(conn != null) {
				return true;
			}
			return false;
		} catch(Exception e) {
			throw e;
		}
	}

	public boolean validateUser(Map map) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean registerUser(Map map) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
