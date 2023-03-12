package spring.boot.fileHandler.util;

import java.io.StringReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import spring.boot.fileHandler.entity.Employee;

public class EmployeeUtils {
	public static List<Employee> parseEmployees(String parsedContent) {
		List<Employee> employees = new CsvToBeanBuilder<Employee>(new StringReader(parsedContent))
										.withType(Employee.class)
										.build()
										.stream()
										.toList();
		
		return employees;
	}
}
