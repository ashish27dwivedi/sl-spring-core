package com.self.learn.spring.core.dto;

public class Country {
	private String name;
	private AbstractBox box;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractBox getBox() {
		return box;
	}

	public void setBox(AbstractBox box) {
		this.box = box;
	}

}
