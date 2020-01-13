package com.javartisan.spring.service.lookup.demo;

import org.springframework.asm.ClassVisitor;


/**
 * 访问者模式，有时间学习一下
 */
public class UserServiceClassVisitor extends ClassVisitor {

	public UserServiceClassVisitor(int api) {
		super(api);
	}

	public UserServiceClassVisitor(int api, ClassVisitor classVisitor) {
		super(api, classVisitor);
	}
}
