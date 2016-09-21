package com.glxt.study.spring.annotation.componentscan.packageA;

import org.springframework.stereotype.Component;

@Component
public class BeanA
{
	public BeanA()
	{
		System.out.println("BeanA Constructor");
	}
	@Override
	public String toString()
	{
		return "BeanA";
	}
}
