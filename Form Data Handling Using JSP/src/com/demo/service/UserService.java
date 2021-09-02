package com.demo.service;

import java.util.List;

import com.demo.dao.User;

public interface UserService {
	public int findUserByEmail(String email);
	public User addUser(User user);
	public void updateUser(int id,String username,String address,String phoneNumber);
	public List<User> getAllUser();
}
