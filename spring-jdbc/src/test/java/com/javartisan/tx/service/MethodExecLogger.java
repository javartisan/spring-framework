package com.javartisan.tx.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MethodExecLogger {
	public MethodExecLogger() {
		System.out.print("");
	}

	@Pointcut("execution(public * com.javartisan.tx.service.*Service.*(..))")
	private void exeExpr() {
	}

	@Around("exeExpr()")
	public Object record(ProceedingJoinPoint pjp) {

		Object[] args = pjp.getArgs();
		Signature methodName = pjp.getSignature();
		System.err.println("method Name = " + methodName + " args = " + args);
		Object returnValue;
		try {
			returnValue = pjp.proceed();
			System.err.println("method Name = " + methodName + " args = " + args + " exec done.");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw new RuntimeException(throwable.getMessage());
		}
		return returnValue;
	}

}
