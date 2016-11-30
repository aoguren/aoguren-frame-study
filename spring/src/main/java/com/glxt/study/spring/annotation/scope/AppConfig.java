package com.glxt.study.spring.annotation.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Bar bar() {
        return new Bar();
    }
    
    public static void main(String[] args)
	{
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(
    			AppConfig.class);
    	
    	System.out.println("First Bar: ");
    	Bar bar1 = ctx.getBean(Bar.class);
    	
    	System.out.println("Second Bar: ");
    	Bar bar2 = ctx.getBean(Bar.class);
	}
}