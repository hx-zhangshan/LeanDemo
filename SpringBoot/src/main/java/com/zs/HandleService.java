package com.zs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public class HandleService {

	public void say(){
		Teacher teacher = new Teacher();
		List<Student> students=new ArrayList<Student>();
		Student student = new Student();
		
		student.setAge("16");
		student.setGrade(2);
		student.setName("jjj");
		student.setScode(99.0);
		
		Student student2 = new Student();
		
		student2.setAge("16");
		student2.setGrade(100);
		student2.setName("ddd");
		student2.setScode(99.0);
		students.add(student2);
		students.add(student);
		
		teacher.setAge("40");
		teacher.setGrade(2);
		//teacher.setName("ggg");
		teacher.setStudent(students);
		 Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		 Set<ConstraintViolation<Teacher>> validate = validator.validate(teacher);
		for (ConstraintViolation<Teacher> constraintViolation : validate) {
			System.out.println(constraintViolation.getMessage());
		}
		System.out.println(teacher.toString());
	}
}
