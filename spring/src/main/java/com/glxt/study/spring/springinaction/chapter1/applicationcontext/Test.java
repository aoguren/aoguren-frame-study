package com.glxt.study.spring.springinaction.chapter1.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public void say()
	{
		System.out.println("hello world!");
	}
	public static void main(String[] args)
	{
		// 方式一 ：ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("com/glxt/study/spring/springinaction/chapter1/applicationcontext/application.xml");
		Test test = (Test) context.getBean("test");
		test.say();
	}
}