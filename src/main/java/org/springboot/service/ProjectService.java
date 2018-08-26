package org.springboot.service;

import java.util.List;

import org.springboot.dao.ProjectDao;
import org.springboot.dto.ProjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectDao projectDao;
	
	public void add(ProjectDto projectDto) {
		projectDao.save(projectDto);
	}
	
	public List<ProjectDto> getAll(int employeeId) {
		return projectDao.findAllByEmployeeDtoId(employeeId);
	}
	
	public ProjectDto getById(int projectId) {
		return projectDao.findById(projectId).get();
	}
	
	public void update(ProjectDto projectDto) {
		projectDao.save(projectDto);
	}
	
	public void delete(int projectId) {
		projectDao.deleteById(projectId);
	}

}
