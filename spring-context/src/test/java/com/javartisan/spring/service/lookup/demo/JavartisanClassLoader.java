package com.javartisan.spring.service.lookup.demo;

public class JavartisanClassLoader extends ClassLoader {
	@SuppressWarnings("unchecked")
	public Class defineClassByName(String name, byte[] b, int off, int len) {
		Class clazz = super.defineClass(name, b, off, len);
		return clazz;
	}
}
