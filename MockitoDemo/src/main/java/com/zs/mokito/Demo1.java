package com.zs.mokito;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
//@RunWith(value=SpringJUnit4ClassRunner.class)
//@ContextConfiguration
public class Demo1 {
	@Mock
	private UserAble userMock;

	@Test
	public  void test() {
		List<String> mockList = Mockito.mock(List.class);
		//使用模拟对象
		mockList.add("one");
		mockList.clear();
		
		//选择性的和显式的验证对象
		Mockito.verify(mockList).add("one");
		Mockito.verify(mockList).clear();
		//UserAble userMock = Mockito.mock(UserAble.class);
		//运用注解 初始化所有的 被mock注解的 类 。
		MockitoAnnotations.initMocks(this);
		Mockito.when(userMock.say()).thenReturn("shabi");
		String say = userMock.say();
		System.out.println("zheli :"+say);

	}
}
