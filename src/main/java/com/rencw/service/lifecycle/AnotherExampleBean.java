package com.rencw.service.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class AnotherExampleBean implements InitializingBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet ok");
	}
	
	public AnotherExampleBean() {
		System.out.println("AnotherExampleBean ok");
	}
}
