package com.zs.spring;

import org.springframework.context.annotation.Bean;

//@Component
public class Student {

	private String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我不是空！！！";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Bean
	public void initMethod(){
		this.name="zzzzz";
	}
	@Bean
	public void destroyMethod(){
		System.out.println("退出方法！！！！");
	}
}
