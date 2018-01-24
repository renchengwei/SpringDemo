package com.rencw.service.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class CustomerPreferenceDao implements CustomerPreferenceDaoParent{

	public CustomerPreferenceDao() {
		System.out.println("CustomerPreferenceDao");
	}
	@PostConstruct
	public void populateMovieCache() {
		System.out.println("populateMovieCache");
	}
	@PreDestroy
	public void clearMovieCache() {
		System.out.println("clearMovieCache");
	}
}
