package com.glxt.study.spring.aop.simpledemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/glxt/study/spring/aop/simpledemo/beans.xml");
		Student student = ctx.getBean(Student.class,"student");
		student.getName();
		student.getAge();
	}
}
