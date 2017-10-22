package com.test.Service;

import com.test.dao.UserDaoImpl;
import lombok.Getter;
import lombok.Setter;

public class CustomerServiceImpl implements CustomerService {
	@Setter@Getter
	private UserDaoImpl userDao;

	@Override
	public void save() {
		System.out.println("hello customer");
		userDao.get();
	}

}
