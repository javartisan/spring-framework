package com.javartisan.spring.service.lookup.demo;

import org.springframework.asm.MethodVisitor;

/**
 * 访问者模式，有时间学习一下
 */
public class UserServiceMethodVisitor extends MethodVisitor {

	public UserServiceMethodVisitor(int api) {
		super(api);
	}

	public UserServiceMethodVisitor(int api, MethodVisitor methodVisitor) {
		super(api, methodVisitor);
	}
}
