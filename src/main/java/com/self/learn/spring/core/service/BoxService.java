package com.self.learn.spring.core.service;

import com.self.learn.spring.core.dto.AbstractBox;
import com.self.learn.spring.core.dto.Database;
import com.self.learn.spring.core.dto.LDAP;
import com.self.learn.spring.core.dto.Server;

public class BoxService implements IService
{
	IService serverService;
	IService databaseService;
	IService ldapService;

	@Override
	public Object add() {
		
		return pupulateBox(new AbstractBox());
	}

	public AbstractBox pupulateBox(AbstractBox abstractBox) {

		abstractBox.setServer((Server)serverService.add());
		abstractBox.setDatabase((Database)databaseService.add());
		abstractBox.setLdap((LDAP)ldapService.add());
		abstractBox.setType("DEV");
		abstractBox.setUser("ind1appl");
		return abstractBox;
	}
}
