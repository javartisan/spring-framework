package com.javartisan.spring.repo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContainerHolder implements ApplicationContextAware {

	@Autowired
	private UserDao userDao;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(userDao);
		System.out.println(applicationContext);
	}
}
