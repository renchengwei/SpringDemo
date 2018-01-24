package com.rencw.service.annotation;

import javax.inject.Inject;
import javax.inject.Named;

@Named("simpleMovieLister")
public class SimpleMovieLister {

	@Inject
	private MovieFinder finder;
}
