package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskA {

	private B b;
	@Autowired
	public void setB(B b) {
		this.b = b;
	}
}
