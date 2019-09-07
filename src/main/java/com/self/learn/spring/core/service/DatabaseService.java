package com.self.learn.spring.core.service;

import com.self.learn.spring.core.dto.Database;

public class DatabaseService implements IService
{
 @Override
public Object add() {
	return populateDatabase(new Database());
}

private Object populateDatabase(Database database) {
	database.setDbInsatance("Instance");
	database.setHost("Host");
	database.setPassword("password");
	database.setPort("2222");
	database.setTunnelRequired(false);
	database.setUrl("www.www.www");
	database.setUser("User");
	return database;
}
}
