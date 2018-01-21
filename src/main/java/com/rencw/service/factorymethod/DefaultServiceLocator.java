package com.rencw.service.factorymethod;

public class DefaultServiceLocator {

	private static ClientService clientService = new ClientService();
	
	public ClientService createInstance() {
		System.out.println("DefaultServiceLocator");
		return clientService;
	}
}
