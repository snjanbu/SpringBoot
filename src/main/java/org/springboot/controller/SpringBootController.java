package org.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springboot.dto.EmployeeDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping("/welcome")
	//If the methodName is not mentioned in RequestMapping,default call would be made to that method.
	public String sayWelcome() {
		return "Welcome to the first page";
	}
	
	@RequestMapping("/list")
	public List<EmployeeDto> list(){
		return Arrays.asList(
				new EmployeeDto(6100, "Sanjay"),
				new EmployeeDto(6101, "Santhosh"),
				new EmployeeDto(6102, "Seetha"));
	}

}
