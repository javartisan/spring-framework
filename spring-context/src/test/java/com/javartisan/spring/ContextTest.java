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
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
		C c = context.getBean(C.class);
		System.out.println(a);
	}



	// 循环
	@Test
	public void cycleConstuctorDependency() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CA a = context.getBean(CA.class);
		CB b = context.getBean(CB.class);
		CC c = context.getBean(CC.class);
		System.out.println(a);
	}


	@Test
	public void testClassPathXmlApplicationContext() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(RESOURCE_CONTEXT);
		System.out.println(context);
	}


}
