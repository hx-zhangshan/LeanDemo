package com.zs;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;


/**
 * @author zhangS
 * @date 2017骞�5鏈�26鏃ヤ笂鍗�9:55:37
 * @Email 260262911@qq.com
 */
@Validated
public class Student {

	public Student(){}
	@NotEmpty(message="专委会")
	private String name;
	
	private String age;
	@Max(value=100)
	private int grade;
	
	private double scode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getScode() {
		return scode;
	}

	public void setScode(double scode) {
		this.scode = scode;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade
				+ ", scode=" + scode + "]";
	}
	
	
}
