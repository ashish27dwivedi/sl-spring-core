package com.self.learn.spring.core.service;

import java.util.ArrayList;
import java.util.List;

import com.self.learn.spring.core.dto.AbstractBox;
import com.self.learn.spring.core.dto.Project;

public class ProjectService implements IService {

	public IService countyService;
	
	public Project add() {
		Project project= (Project)populateProject(new Project());
		return project;
		
	}

	public Object populateProject(Project project) {
		List<AbstractBox> lst = new ArrayList<AbstractBox>();
				lst.add((AbstractBox) countyService.add());
		project.setBoxList(lst);
		return project;
	}
	
}
