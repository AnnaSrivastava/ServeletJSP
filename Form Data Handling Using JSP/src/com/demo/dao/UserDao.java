package com.demo.dao;

import java.util.List;

public interface UserDao {
	public int findUserByEmail(String email);
	public User addUser(User user);
	public void updateUser(int id,String username,String address,String phoneNumber);
	public List<User> getAllUser();
}
