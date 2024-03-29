package com.cts.emp.dao;

public interface DbConstants {
	public static final String PROPERTIES_FILE = "database.properties";
	public static final String DRIVER_CLASS = "db.classname";
	public static final String URL = "db.url";
	public static final String USERNAME = "db.username";
	public static final String PASSWORD = "db.password";
	public static final String INSERT_EMP_COMMAND = "INSERT INTO employee(empno,empname,desig,emptype,salary,dob) "
			+ " VALUES (?,?,?,?,?,?)";

}
