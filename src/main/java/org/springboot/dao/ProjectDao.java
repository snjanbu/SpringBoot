package org.springboot.dao;

import java.util.List;

import org.springboot.dto.ProjectDto;
import org.springframework.data.repository.CrudRepository;

public interface ProjectDao extends CrudRepository<ProjectDto,Integer>{
	
	public List<ProjectDto> findAllByEmployeeDtoId(int employeeId);

}
