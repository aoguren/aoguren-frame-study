package com.glxt.study.spring.springinaction.chapter4.writingpointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience
{
	@Before("execution(** com.glxt.study.spring.springinaction.chapter4.writingpointcuts.Performance.perform(..))")
	public void silenceCellPhones()
	{
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(** com.glxt.study.spring.springinaction.chapter4.writingpointcuts.Performance.perform(..))")
	public void takeSeats()
	{
		System.out.println("Taking seats");
	}
}
