package com.zs.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringBoot.class)
@ActiveProfiles(profiles="tes")
public class JunitTest {

	@Autowired
	private Student student;
	@Autowired
	private DataSource data;
	
	@Autowired
	private Imessage message;
	
	@Test
	public  void test() {
		System.out.println(student.getName());
		Assert.assertFalse(null==student);
		
	}
	@Test
	public void testJdbc() throws SQLException{
		Connection connection = data.getConnection();
		PreparedStatement cs = connection.prepareStatement("select * from user");
		ResultSet eq = cs.executeQuery();
//		Statement cs = connection.createStatement();
//		ResultSet eq = cs.executeQuery("select * from user");
		while (eq.next()) {
			System.out.println(eq.getString("username"));
			
		}
		connection.close();
		cs.close();
	}
	@Test
	public void test2(){
		message.say();
	}
}
