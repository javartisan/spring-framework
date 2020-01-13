package com.javartisan.spring.service.constuctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CC {

	private CA a;

	@Autowired
	public CC(CA a) {
		this.a = a;
	}
}
