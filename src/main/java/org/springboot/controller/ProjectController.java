package org.springboot.controller;

import java.util.List;

import org.springboot.dto.EmployeeDto;
import org.springboot.dto.ProjectDto;
import org.springboot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/list/{employeeId}/project",method=RequestMethod.GET)
	public List<ProjectDto> getAll(@PathVariable int employeeId){
		return projectService.getAll(employeeId);
	}
	
	@RequestMapping(value="/list/{employeeId}/project/{projectId}",method=RequestMethod.GET)
	public ProjectDto getAllById(@PathVariable int employeeId,@PathVariable int projectId){
		return projectService.getById(projectId);
	}	

	@RequestMapping(value="/list/{employeeId}/project/{projectId}",method=RequestMethod.PUT)
	public void update(@RequestBody ProjectDto projectDto,@PathVariable int employeeId){
		projectDto.setEmployeeDto(new EmployeeDto(employeeId,""));
		projectService.update(projectDto);;
	}
	
	@RequestMapping(value="/list/{employeeId}/project/{projectId}",method=RequestMethod.DELETE)
	public void delete(@PathVariable int employeeId,@PathVariable int projectId){
		projectService.delete(projectId);
	}
	
	@RequestMapping(value="/list/{employeeId}/project",method=RequestMethod.POST)
	public void insert(@RequestBody ProjectDto projectDto,@PathVariable int employeeId){
		projectDto.setEmployeeDto(new EmployeeDto(employeeId,""));
		projectService.add(projectDto);;
	}
}
