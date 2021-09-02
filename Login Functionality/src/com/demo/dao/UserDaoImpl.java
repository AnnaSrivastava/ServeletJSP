package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.entity.User;
import com.demo.factory.ConnectionFactory;

public class UserDaoImpl implements UserDao {

	private Connection connection = null;

	public UserDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public User getUser(String username, String password) {
		User user = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("Select * from user where username=? and password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("username"),
						resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
