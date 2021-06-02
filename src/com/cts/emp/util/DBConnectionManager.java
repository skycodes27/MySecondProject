package com.cts.emp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.emp.dao.DbConstants;
import com.cts.emp.exception.EmplyoeeSystemAdminException;

public class DBConnectionManager {
	private static DBConnectionManager instance;
	
	private static Connection connection = null;
	private static Properties dbProperties = null;

	public DBConnectionManager() throws EmplyoeeSystemAdminException {
		loadProperties();

		
		

	}

	public static DBConnectionManager getInstance() throws EmplyoeeSystemAdminException {

		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	public void loadProperties() throws EmplyoeeSystemAdminException {
		

	}
}
