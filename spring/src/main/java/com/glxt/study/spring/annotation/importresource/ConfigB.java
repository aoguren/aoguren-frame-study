package com.glxt.study.spring.annotation.importresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ConfigA.class)
@ImportResource("classpath:/com/glxt/study/spring/annotation/importresource/beans.xml")
public class ConfigB
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
		A a = ctx.getBean(A.class);
		B b = ctx.getBean(B.class);
		System.out.println(a);
		System.out.println(b);
	}
}
