package com.test.annotation;

import org.springframework.stereotype.Repository;

@Repository(value = "userAnnotationDao1")
public class UserAnnotationDaoImpl implements UserAnnotationDao {
	@Override
	public void save() {
		System.out.println("持久层");
	}
}
