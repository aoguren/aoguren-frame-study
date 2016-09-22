package com.glxt.study.spring.annotation.importresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA
{
	@Bean
	public A createA()
	{
		return new A();
	}
}
