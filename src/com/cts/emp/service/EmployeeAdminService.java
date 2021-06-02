package com.cts.emp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.emp.dao.EmployeeDAO;
import com.cts.emp.dto.Employee;
import com.cts.emp.exception.EmplyoeeSystemAdminException;
import com.cts.emp.util.ApplicationUtil;

public class EmployeeAdminService {
	private static final String DELIMITER = ",";

	public static List<Employee> buildEmployeeList(List<String> empRecords) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		return employeeList;
	}
	
	public boolean addEmployeeDetails(String inputFeed) throws EmplyoeeSystemAdminException {
		
		return true;
		
	}
	
	public static double calculateSalaryHike(String empType, String desig, double currentSalary) {
		double hikedSalary =0.0;
		
		
		return hikedSalary;
	}

}
