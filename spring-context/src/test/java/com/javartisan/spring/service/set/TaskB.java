package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskB {

	private TaskC c;

	@Autowired
	public void setC(TaskC c) {
		this.c = c;
	}
}
