package com.glxt.study.spring.aop.simpledemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


// 声明 aspect
@Aspect
public class Logging
{
	// 声明pointcut
	@Pointcut("execution(* com.glxt.study.spring.aop.simpledemo.*.*(..))")
	private void selectAll(){}
	
	// 声明advice
	// 前置增强
	@Before("selectAll()")
	public void beforeAdvice()
	{
		System.out.println("Going to setup student profile.");
	}
}
