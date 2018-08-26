package org.springboot.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProjectDto {
	
	@Id
	private int projectId;
	
	private String projectName;
	
	@ManyToOne
	private EmployeeDto employeeDto;

	public ProjectDto() {
		super();
	}
	
	public ProjectDto(int projectId, String projectName,EmployeeDto employeeDto) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employeeDto = employeeDto;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public EmployeeDto getEmployeeDto() {
		return employeeDto;
	}

	public void setEmployeeDto(EmployeeDto employeeDto) {
		this.employeeDto = employeeDto;
	}

}
