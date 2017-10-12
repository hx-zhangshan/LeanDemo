package com.zs.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DiCofing1 {

	@Bean
	public Imessage getMessage(){
		return new SubMessage1();
	}
}
