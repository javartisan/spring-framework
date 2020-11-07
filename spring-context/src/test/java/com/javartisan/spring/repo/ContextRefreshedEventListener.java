package com.javartisan.spring.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private AsyncSimpleApplicationEventMulticaster asyncSimpleApplicationEventMulticaster;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(event);
	}
}
