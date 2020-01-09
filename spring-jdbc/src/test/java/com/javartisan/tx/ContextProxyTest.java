package com.javartisan.tx;

import com.javartisan.tx.config.Config;
import com.javartisan.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextProxyTest {

	@Test
	public void testAnnotationConfigApplicationContextStart() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserService userService = context.getBean(UserService.class);
		userService.echo();
		System.out.println(userService.getClass());
	}



}
