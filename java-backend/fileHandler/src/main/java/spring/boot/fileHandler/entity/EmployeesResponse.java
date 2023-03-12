package spring.boot.fileHandler.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeesResponse {
	private String action;
	
	@JsonProperty("records")
	private List<Employee> employees;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public EmployeesResponse(String action, List<Employee> employees) {
		super();
		this.action = action;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "EmployeesResponse [action=" + action + ", employees=" + employees + "]";
	}
	
}
