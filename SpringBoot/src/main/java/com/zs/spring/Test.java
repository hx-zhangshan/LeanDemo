package com.zs.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringBoot.class);
		Student bean = context.getBean(Student.class);
		DataSource bean2 = context.getBean(DataSource.class);
		Connection connection = bean2.getConnection();
		System.out.println(bean);
	}
}
