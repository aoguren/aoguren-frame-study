package com.glxt.study.spring.annotation.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages={"com.glxt.study.spring.annotation.componentscan.packageA",
			"com.glxt.study.spring.annotation.componentscan.packageB"})
public class ComponentScanAnnotationViaXMLExample
{
	public ComponentScanAnnotationViaXMLExample()
	{
		System.out.println("Constructor ComponentScanAnnotationViaXMLExample");
	}
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/glxt/study/spring/annotation/componentscan/beans.xml");
		System.out.println(ctx.getBean("beanA"));
		System.out.println(ctx.getBean("beanA1"));
		System.out.println(ctx.getBean("beanB"));
	}
}
