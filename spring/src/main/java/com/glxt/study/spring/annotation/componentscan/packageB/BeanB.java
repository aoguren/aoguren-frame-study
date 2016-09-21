package com.glxt.study.spring.annotation.componentscan.packageB;

import org.springframework.stereotype.Component;

@Component
public class BeanB
{
	public BeanB()
	{
		System.out.println("BeanB Constructor");
	}
	@Override
	public String toString()
	{
		return "BeanB";
	}
}
