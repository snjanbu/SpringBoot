package org.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springboot.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class SpringBootService {

	List <EmployeeDto>employeeDtoList=Arrays.asList(
			new EmployeeDto(6100, "Sanjay"),
			new EmployeeDto(6101, "Santhosh"),
			new EmployeeDto(6102, "Seetha"));
	
	public List<EmployeeDto> getAllEmployeeData(){
		return employeeDtoList;
	}
	
	public EmployeeDto getEmployeeData(int id) {
		return employeeDtoList.stream().filter(value->value.getId()==id).findFirst().get();
	}
}
