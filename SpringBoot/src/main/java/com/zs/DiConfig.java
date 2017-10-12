package com.zs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zs")
public class DiConfig {

	@Bean
	public HandleService getHandleService(){
		
		return new HandleService();
	}
}
