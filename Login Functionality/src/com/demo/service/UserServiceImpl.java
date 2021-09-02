package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.entity.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao=null;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}
	
	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username,password);
	}

}
