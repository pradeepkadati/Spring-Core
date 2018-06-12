package org.spring.core.xmlConfig;

import org.spring.core.beans.AccountService;
import org.spring.core.beans.ClientService;

public class TestFactoryBean {

	public static void main(String[] args) {
		

		ClientService clientService = XmlContextUtil.getBean("clientService",ClientService.class);

		AccountService accountService = XmlContextUtil.getBean("accountService", AccountService.class);
		
		clientService.getClient();
		
		accountService.getAccount();
	}

}
