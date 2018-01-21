package com.rencw.service.factorymethod;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("clientService")
public class ClientService implements ApplicationContextAware {
	
	private static ClientService clientService = new ClientService();
	
	private ApplicationContext applicationContext;
	
	public ClientService() {
		
	}
	
	public static ClientService createInstance() {
		System.out.println("ok");
		return clientService;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(this.applicationContext);
	}
}
