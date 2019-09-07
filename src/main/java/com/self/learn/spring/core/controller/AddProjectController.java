package com.self.learn.spring.core.controller;

import com.self.learn.spring.core.service.IService;

public class AddProjectController {
	public IService projectService;
	
	
	public void addProject() {
		projectService.add();
	}

}
