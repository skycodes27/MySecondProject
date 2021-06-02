package com.cts.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cts.emp.dto.Employee;
import com.cts.emp.exception.EmplyoeeSystemAdminException;
import com.cts.emp.util.ApplicationUtil;
import com.cts.emp.util.DBConnectionManager;

public class EmployeeDAO {

	public static Connection connection = null;

	public boolean addEmployeeDetails(List<Employee> employeeList) throws EmplyoeeSystemAdminException {
		boolean recordsAdded = false;
		
		return recordsAdded;
	}

}
