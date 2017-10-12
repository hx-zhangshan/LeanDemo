package com.zs.SpringBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zs.demo1.Diconfig;
import com.zs.demo1.TestBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Diconfig.class})
@ActiveProfiles("TES")
public class TestDemo {
@Autowired
private TestBean testBean;
	@Test
	public void testName() {
		String dd=testBean.getContext();
		System.out.println(dd);
		
	}
	
}
