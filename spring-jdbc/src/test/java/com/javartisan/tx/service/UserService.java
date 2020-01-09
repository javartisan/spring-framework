package com.javartisan.tx.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

	@Transactional
	public void echo() {
		System.out.println(getClass());
	}
}
