package org.springboot.dto;

public class EmployeeDto {
	
	private int id;

	private String employeeName;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(int id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
