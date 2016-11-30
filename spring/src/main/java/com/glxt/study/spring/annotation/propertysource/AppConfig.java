package com.glxt.study.spring.annotation.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/glxt/study/spring/annotation/propertysource/app.properties")
public class AppConfig
{
	@Autowired
	Environment environment;
	
	@Bean
	public Car getCar()
	{
		Car car = new Car();
		car.setName(environment.getProperty("car.name"));
		car.setPrice(Double.parseDouble(environment.getProperty("car.price")));
		return car;
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = ctx.getBean(Car.class);
		System.out.println(car);
	}
}
