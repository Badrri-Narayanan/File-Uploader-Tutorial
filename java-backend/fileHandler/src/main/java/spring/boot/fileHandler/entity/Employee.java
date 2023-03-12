package spring.boot.fileHandler.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;

public class Employee {
	@CsvBindByName
	private int id;
	
	@CsvBindByName(column = "first_name")
	@JsonProperty("first_name")
	private String firstName;

	@CsvBindByName(column = "last_name")
	@JsonProperty("last_name")
	private String lastName;
	
	@CsvBindByName
	@JsonProperty
	private String email;
	
	@CsvBindByName
	@JsonProperty
	private String gender;
	
	@CsvBindByName
	@JsonProperty
	private String company;
	
	@CsvBindByName(column = "job_title")
	@JsonProperty("job_title")
	private String jobTitle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Employee(int id, String firstName, String lastName, String email, String gender, String company,
			String jobTitle) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.company = company;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", company=" + company + ", jobTitle=" + jobTitle + "]";
	}
	
	public Employee() {
	}

}
