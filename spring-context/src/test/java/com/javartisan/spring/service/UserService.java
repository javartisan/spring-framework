package com.javartisan.spring.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

	public void echo() {
		System.out.println(getClass());
	}
}
