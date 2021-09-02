package com.demo.service;

import java.util.List;

import com.demo.dao.User;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}
	
	@Override
	public int findUserByEmail(String email) {
		return userDao.findUserByEmail(email);
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public void updateUser(int id, String username, String address, String phoneNumber) {
		userDao.updateUser(id, username, address, phoneNumber);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
