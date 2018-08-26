package org.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springboot.dto.EmployeeDto;
import org.springboot.service.SpringBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@Autowired
	private SpringBootService springBootService;
	
	@RequestMapping("/welcome")
	//If the methodName is not mentioned in RequestMapping,default call would be made to that method.
	public String sayWelcome() {
		return "Welcome to the first page";
	}
	
	@RequestMapping("/list")
	public List<EmployeeDto> list(){
		return springBootService.getAllEmployeeData();
	}
	
	@RequestMapping("/list/{employeeId}")
	public EmployeeDto getEmployeeDetail(@PathVariable Integer employeeId) {
		return springBootService.getEmployeeData(employeeId);
	}
	
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		springBootService.addEmployee(employeeDto);
	}
	
	@RequestMapping(value="/list/{employeeId}",method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable Integer employeeId,@RequestBody EmployeeDto employeeDto) {
		springBootService.updateEmployee(employeeId, employeeDto);
	}
	
	@RequestMapping(value="/list/{employeeId}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable Integer employeeId) {
		springBootService.deleteEmployee(employeeId);
	}

}
