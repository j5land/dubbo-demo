package com.testdubbo.serviceimpl;

import com.testdubbo.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public String login(String userName, String password) {
		System.out.println("invoke name :"+userName);
		return userName;
	}

}
