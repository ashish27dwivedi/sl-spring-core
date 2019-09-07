package com.self.learn.spring.core.service;

import com.self.learn.spring.core.dto.Server;

public class ServerService implements IService{
@Override
public Object add() {
	
	return populateServer(new Server());
}

private Object populateServer(Server server) {
	server.setName("tuintlvs121");
	server.setLocation("/opt/here/");
	server.setOwner("inl1appl");
	server.setVersion("Tomcat-8");
	return server;
}
}
