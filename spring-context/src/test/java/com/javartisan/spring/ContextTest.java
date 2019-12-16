package com.javartisan.spring;

import com.javartisan.spring.config.Config;
import com.javartisan.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextTest {

	@Test
	public void testContext() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}


}
