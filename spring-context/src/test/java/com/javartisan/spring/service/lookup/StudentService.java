package com.javartisan.spring.service.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 模拟多例
 */
@Service
//@Scope(scopeName = "prototype")
public class StudentService {

	@Override
	public String toString() {
		return super.toString();
	}
}
