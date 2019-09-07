package com.self.learn.spring.core.dto;

public class Database {

	private String host;
	private String port;
	private String url;
	private String dbInsatance;
	private String user;
	private String password;
	private boolean isTunnelRequired;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDbInsatance() {
		return dbInsatance;
	}
	public void setDbInsatance(String dbInsatance) {
		this.dbInsatance = dbInsatance;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isTunnelRequired() {
		return isTunnelRequired;
	}
	public void setTunnelRequired(boolean isTunnelRequired) {
		this.isTunnelRequired = isTunnelRequired;
	}
	
}
