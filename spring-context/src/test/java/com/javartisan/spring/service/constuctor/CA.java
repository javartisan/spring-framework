package com.javartisan.spring.service.constuctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CA {

	private CB b;

	@Autowired
	public CA(CB b) {
		this.b = b;
	}
}
