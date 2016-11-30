package com.glxt.study.spring.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.glxt.study.spring.annotation.componentscan.packageA",
		"package com.glxt.study.spring.annotation.componentscan.packageB"})
public class ComponentScanAnnotationExample
{
	public ComponentScanAnnotationExample()
	{
		System.out.println("ComponentScanAnnotationExample Constructor");
	}
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanAnnotationExample.class);
		System.out.println(ctx.getBean("beanA"));
		System.out.println(ctx.getBean("componentScanAnnotationExample"));
		System.out.println(ctx.getBean("beanB"));
	}
	
	@Override
	public String toString()
	{
		return "ComponentScanAnnotationExample";
	}
}
