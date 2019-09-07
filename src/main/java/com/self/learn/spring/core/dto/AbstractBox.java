package com.self.learn.spring.core.dto;

public class AbstractBox {

	private Server server;
	private String user;
	private Database database;
	private LDAP ldap;
	private String type;
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Database getDatabase() {
		return database;
	}
	public void setDatabase(Database database) {
		this.database = database;
	}
	public LDAP getLdap() {
		return ldap;
	}
	public void setLdap(LDAP ldap) {
		this.ldap = ldap;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
