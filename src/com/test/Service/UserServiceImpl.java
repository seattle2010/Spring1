package com.test.Service;

import lombok.Getter;
import lombok.Setter;

public class UserServiceImpl implements UserService {
	@Setter@Getter
	private String name;

	@Override
	public void sayHello() {
		System.out.println("hello"); 
	}

}
