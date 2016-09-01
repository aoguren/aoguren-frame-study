package com.glxt.study.spring.springinaction.chapter1.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test
{
	public void say()
	{
		System.out.println("hello world!");
	}

	public static void main(String[] args)
	{
		method3();
	}
	
	public static void method3()
	{
		// 方式三：AnnotationConfigApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(
				com.glxt.study.spring.springinaction.chapter1.applicationcontext.Test.class);
		Test test = (Test) context.getBean("test");
		test.say();
	}
	
	public static void method2()
	{
		// 方式二：FileSystemXmlApplicationContext
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:/study/spring-study/spring/src/main/java/com/glxt/study/spring/springinaction/chapter1/applicationcontext/application.xml");
		Test test = (Test) context.getBean("test");
		test.say();
	}
	public static void method1()
	{
		// 方式一 ：ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/glxt/study/spring/springinaction/chapter1/applicationcontext/application.xml");
		Test test = (Test) context.getBean("test");
		test.say();
	}
}