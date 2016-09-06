package com.glxt.study.spring.springinaction.chapter2.writingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test
{
	@Bean
	public CompactDisc sgtPeppers()
	{
		return new SgtPeppers();
	}
	
	public static void main(String[] args)
	{
		ApplicationContext annotationContext = new AnnotationConfigApplicationContext("com.glxt.study.spring.springinaction.chapter2.writingbean");
		CompactDisc c = annotationContext.getBean(CompactDisc.class);// 创建bean的引用对象
		c.play();
	}
}
