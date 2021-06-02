package com.cts.emp.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cts.emp.exception.EmplyoeeSystemAdminException;

public class ApplicationUtil {

	public static List<String> readFile(String empFile) throws EmplyoeeSystemAdminException {
		List<String> empList = new ArrayList<String>();

		return empList;
	}

	public static java.sql.Date utilToSqlDateConverter(java.util.Date utilDate) {
		java.sql.Date sqlDate = null;
		return sqlDate;
	}
	
	public static java.util.Date stringToDateConverter(String stringDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		try {
			return dateFormat.parse(stringDate);
		} catch (ParseException pe) {
			return null;
		}

	}

}
