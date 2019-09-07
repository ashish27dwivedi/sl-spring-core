package com.self.learn.spring.core.dto;

import java.util.List;

public class Project {
	private String name;
	private List<AbstractBox> boxList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AbstractBox> getBoxList() {
		return boxList;
	}

	public void setBoxList(List<AbstractBox> boxList) {
		this.boxList = boxList;
	}

}
