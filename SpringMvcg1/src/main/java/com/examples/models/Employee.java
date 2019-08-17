package com.examples.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	
	@NotNull
	@Min(1)
	private Integer employeeId;
	
	@NotEmpty(message="Employee Name is required")
	@Size(min=3,max=12)
	
	private String employeeName;
	
	@Email(message="Email should be in proper format")
	@NotEmpty(message="Email is required")
	private String email;
	
	@NotEmpty
	@Pattern(regexp="[6789][0-9] {9}")
	private String contactNumber;
	
	
	
	
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
