package com.zs.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("tes")
public class DiConfig2 {

	@Bean
	public Imessage getMessage(){
		return new SubMessage2();
	}
}
