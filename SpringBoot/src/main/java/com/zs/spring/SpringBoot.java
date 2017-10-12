package com.zs.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.zs.spring")
@PropertySource("jdbc.properties")
@Import({DiCofing1.class,DiConfig2.class})
public class SpringBoot {

	@Autowired
	private Environment env;
	@Bean(initMethod="initMethod",destroyMethod="destroyMethod")
	public  Student getStudent() {
//		Student student = new Student();
//		student.setName("zs");
		return new Student();

	}
	@Bean
	public DataSource getDataSoure(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		return dataSource;
	}
}
