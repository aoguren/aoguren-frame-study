package com.glxt.study.spring.annotation.importexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB
{
	@Bean
	public B createB()
	{
		return new B();
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
		A a = ctx.getBean(A.class);
		B b = ctx.getBean(B.class);
		System.out.println(a);
		System.out.println(b);
	}
}
