package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskC {


	private TaskA a;

	@Autowired
	public void setA(TaskA a) {
		this.a = a;
	}
}
