package com.test.test;

import com.test.Service.CustomerService;
import com.test.Service.UserService;
import com.test.Service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试ioc的程序
public class UserServiceImplTest {
	//传统调用方式
	@Test
	public void OldsayHello() throws Exception {
		UserServiceImpl userService = new UserServiceImpl();
		userService.sayHello();
	}
	//使用spring框架形式
	@Test
	public void sayHello() throws Exception {
	//创建工厂 加载核心配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从工厂中获取对象
		UserService us = (UserServiceImpl) applicationContext.getBean("userService");
		//调用对象的方法执行
		us.sayHello();

	}

//测试依赖注入 控制反转dao层
	@Test
	public void sayHelloDao() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cs = (CustomerService) applicationContext.getBean("customerService");
		cs.save();

	}
}