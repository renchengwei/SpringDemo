package com.rencw.service.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorBean implements BeanFactoryPostProcessor,BeanNameAware {

	private String beanName;
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] names = beanFactory.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

}
