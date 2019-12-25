package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	private C c;

	@Autowired
	public void setC(C c) {
		this.c = c;
	}
}
