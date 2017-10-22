package com.test.dao;

public class UserDaoImpl implements IUserDao {
	@Override
	public void get() {
		System.out.println("dao层"); 
	}
}
