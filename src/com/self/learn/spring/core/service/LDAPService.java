package com.self.learn.spring.core.service;

import com.self.learn.spring.core.dto.LDAP;

public class LDAPService implements IService
{
@Override
public Object add() {
	
	return poppulateLDAP(new LDAP());
}

private Object poppulateLDAP(LDAP ldap) {
	ldap.setCn("CN");
	ldap.setHost("tuintlvs79");
	ldap.setOu("ou");
	ldap.setPassword("password");
	ldap.setPort("port");
	ldap.setUserName("user");
	return ldap;}
} 	
