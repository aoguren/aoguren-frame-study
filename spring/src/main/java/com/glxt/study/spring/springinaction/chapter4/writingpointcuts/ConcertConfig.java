package com.glxt.study.spring.springinaction.chapter4.writingpointcuts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
	@Bean
	public Audience audience() {
		return new Audience();
	}
}