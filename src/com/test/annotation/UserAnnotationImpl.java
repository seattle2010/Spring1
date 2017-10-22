package com.test.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "UserAnnotation")
public class UserAnnotationImpl implements UserAnnotation {
	//属性  简单值
	@Value(value="tom")
	private String name;
	//引入对象 按照类型自动装配
		//或者下面两个用@Resource(name="userAnnotationDao1") 代替下面两个  他会自动去容器中找名称
	@Autowired
	@Qualifier(value = "userAnnotationDao1")
	private UserAnnotationDao UserAnnotationDao;

	@Override
	public void edit() {
		System.out.println("注解方式");
		System.out.println(name);
		UserAnnotationDao.save();
	}
}
