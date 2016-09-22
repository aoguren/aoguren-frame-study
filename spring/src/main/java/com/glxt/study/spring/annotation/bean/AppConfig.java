package com.glxt.study.spring.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean(initMethod = "init")
	public Foo foo() {
		return new Foo();
	}

    @Bean(destroyMethod = "cleanup")
    public Bar bar() {
        return new Bar();
    }
    
    public static void main(String[] args)
	{
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(
    			AppConfig.class);
    	Foo foo = ctx.getBean(Foo.class);
    	Bar bar = ctx.getBean(Bar.class);
	}
}