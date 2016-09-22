package com.glxt.study.spring.annotation.configuration.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig
{
	@Bean
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}

	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}
