package com.rencw.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rencw.service.AppConfig;

public class TestAnnotationConfigApplicationContext {

	@Test
	public void test() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
