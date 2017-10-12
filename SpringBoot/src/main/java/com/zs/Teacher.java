package com.zs;

import java.util.List;

import javax.validation.Valid;



import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;


@Validated
public class Teacher {

	public Teacher() {
		super();
	}
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

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@NotEmpty(message="老师的名字不能是NULL！！")
	private String name;
	
	private String age;
	
	private int grade;
	@Valid
	private List<Student> student;

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", grade=" + grade
				+ ", student=" + student + "]";
	}
	
}
