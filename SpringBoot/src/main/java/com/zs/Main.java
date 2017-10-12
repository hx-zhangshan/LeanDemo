package com.zs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DiConfig.class);
		HandleService handleService = context.getBean(HandleService.class);

		handleService.say();
		context.close();

	}
}
