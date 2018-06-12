package org.spring.core.beans;

public class DefaultServiceLocator {

	public ClientService  getClientInstance() {
		
		return new ClientService();
	}
	
	public AccountService getAccountInstance() {
		return new AccountService();
	}
}
