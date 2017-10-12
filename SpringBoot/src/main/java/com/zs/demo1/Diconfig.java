package com.zs.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class Diconfig {

	@Bean
	@Profile("DEV")
	public TestBean getDevBean(){
		
		return new TestBean("dev is this.");
	}
	@Bean
	@Profile("TES")
	public TestBean getTestBean(){
		
		return new TestBean("test is this.");
	}
}
