package com.glxt.study.spring.annotation.componentscan.packageA;

import org.springframework.stereotype.Component;

@Component
public class BeanA1
{
	public BeanA1()
	{
		System.out.println("Constructor BeanA1");
	}
	
	@Override
	public String toString()
	{
		return "BeanA1";
	}
}
