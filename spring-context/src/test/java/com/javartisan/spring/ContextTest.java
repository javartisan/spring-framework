package com.javartisan.spring;

import com.javartisan.spring.config.Config;
import com.javartisan.spring.service.UserService;
import com.javartisan.spring.service.constuctor.*;
import com.javartisan.spring.service.set.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextTest {

	private static final String PATH = "/org/springframework/context/support/";
	private static final String RESOURCE_CONTEXT = PATH + "ClassPathXmlApplicationContextTests-resource.xml";


	@Test
	public void testAnnotationConfigApplicationContextStart() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}


	// 字段Autowire循环注入
	@Test
	public void cycleFieldDependency() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TaskA taskA = context.getBean(TaskA.class);
		TaskB taskB = context.getBean(TaskB.class);
		TaskC taskC = context.getBean(TaskC.class);
		System.out.println(taskA);
	}


	// 循环
	@Test
	public void cycleConstuctorDependency() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CA taskA = context.getBean(CA.class);
		CB taskB = context.getBean(CB.class);
		CC taskC = context.getBean(CC.class);
		System.out.println(taskA);
	}


	@Test
	public void testClassPathXmlApplicationContext() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(RESOURCE_CONTEXT);
		System.out.println(context);
	}


}
