package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskA {

	private TaskB b;

	@Autowired
	public void setB(TaskB b) {
		this.b = b;
	}
}
