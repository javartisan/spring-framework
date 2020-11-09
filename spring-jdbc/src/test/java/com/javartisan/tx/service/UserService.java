package com.javartisan.tx.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Transactional
	public void echo() {
		System.out.println(getClass());
	}

	@Transactional
	public void echo(String name) {
		System.out.println(getClass() + " " + name);
	}
}
