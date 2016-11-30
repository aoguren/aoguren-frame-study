package com.glxt.study.spring.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.glxt.study.spring.annotation.componentscan.packageA.BeanA;
import com.glxt.study.spring.annotation.componentscan.packageA.BeanA1;

@Configuration
@ComponentScan(basePackageClasses=BeanA.class,
			excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value=BeanA1.class))
public class ComponentScanExcludeAnnotationExample
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanExcludeAnnotationExample.class);
		System.out.println("Contains BeanA? : " + ctx.containsBean("beanA"));
		System.out.println("Contains BeanA1? : " + ctx.containsBean("beanA1"));
	}
}
