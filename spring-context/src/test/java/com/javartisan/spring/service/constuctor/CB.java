package com.javartisan.spring.service.constuctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CB {

	private CC c;

	@Autowired
	public CB(CC c) {
		this.c = c;
	}
}
