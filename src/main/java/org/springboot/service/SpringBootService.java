package org.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springboot.dao.SpringBootDao;
import org.springboot.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootService {

	@Autowired
	private SpringBootDao springBootDao;
	
	public List<EmployeeDto> getAllEmployeeData(){
		List <EmployeeDto>employeeDtoList=new ArrayList<>();
		springBootDao.findAll().forEach(employeeDtoList::add);
		return employeeDtoList;
	}
	
	public EmployeeDto getEmployeeData(int id) {
		return springBootDao.findById(id).get();
	}
	
	public void addEmployee(EmployeeDto employeeDto) {
		springBootDao.save(employeeDto);
	}
	
	public void updateEmployee(int id,EmployeeDto employeeDto) {
		springBootDao.save(employeeDto);
	}
	
	public void deleteEmployee(int id) {
		springBootDao.deleteById(id);
	}
}
