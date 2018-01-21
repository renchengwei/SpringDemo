package com.rencw.test;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rencw.service.scope.SingletonBean;

public class SpringIocTest {

	@Test
	public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-main.xml");  
//        System.out.println(applicationContext.getBean("clientService"));
//        SingletonBean bean = applicationContext.getBean(SingletonBean.class);
	}
}
