package com.javartisan.spring.repo;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public UserDao() {
		System.out.println("---------");
	}

	@Override
	public String toString() {
		return "UserDao Repo";
	}
}
