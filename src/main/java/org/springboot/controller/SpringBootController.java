package org.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springboot.dto.EmployeeDto;
import org.springboot.service.SpringBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("/list/{id}")
	public EmployeeDto getEmployeeDetail(@PathVariable Integer id) {
		return springBootService.getEmployeeData(id);
	}

}
