package com.javartisan.spring.service.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {


	private A a;

	@Autowired
	public void setA(A a) {
		this.a = a;
	}
}
