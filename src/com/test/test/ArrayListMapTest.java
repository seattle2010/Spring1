package com.test.test;

import com.test.ArrayListMap.UserArray;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayListMapTest {
	@Test
	public void ArrayTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserArray arrs = (UserArray) applicationContext.getBean("userArray");
		System.out.println(arrs);
	}
	
	@Test
	public void ListTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserArray userList = (UserArray) applicationContext.getBean("userList");
		System.out.println(userList);
		
	}

	@Test
	public void MapTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserArray userMap = (UserArray) applicationContext.getBean("userMap");
		System.out.println(userMap);

	}
}
