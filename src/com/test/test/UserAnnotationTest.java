package com.test.test;

import com.test.annotation.UserAnnotation;
import com.test.annotation.UserAnnotationImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAnnotationTest {
	@Test
	public void oldTest() {
		UserAnnotation us = new UserAnnotationImpl();
		us.edit();
	}

	//注解方式
	//@Controller
	//@Service
	//@Repository
	@Test
	public void AnnotationUserTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAnnotation  userAnnotation = (UserAnnotation) ac.getBean("UserAnnotation");
		userAnnotation.edit();
	}
}

