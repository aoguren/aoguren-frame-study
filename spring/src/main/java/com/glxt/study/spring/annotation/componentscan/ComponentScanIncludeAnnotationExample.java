package com.glxt.study.spring.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.glxt.study.spring.annotation.componentscan.packageB.BeanB;

@Configuration
@ComponentScan(basePackages={"com.glxt.study.spring.annotation.componentscan.packageA",
			"com.glxt.study.spring.annotation.componentscan.packageB"},
			includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanB.class),
			useDefaultFilters = false)
public class ComponentScanIncludeAnnotationExample
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanIncludeAnnotationExample.class);
		System.out.println("Contains BeanA? : " + ctx.containsBean("beanA"));
		System.out.println("Contains BeanA1? : " + ctx.containsBean("beanA1"));
		System.out.println("Contains BeanB? : " + ctx.containsBean("beanB"));
	}
}
