package org.springboot.dao;

import org.springboot.dto.EmployeeDto;
import org.springframework.data.repository.CrudRepository;

public interface SpringBootDao extends CrudRepository<EmployeeDto,Integer>{

}
