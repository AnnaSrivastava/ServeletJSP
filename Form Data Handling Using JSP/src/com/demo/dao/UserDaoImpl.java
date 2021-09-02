package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.dao.factory.ConnectionFactory;

import sun.nio.cs.Surrogate.Generator;

public class UserDaoImpl implements UserDao {

	private Connection connection = null;

	public UserDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public int findUserByEmail(String email) {
		int id = -1;
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("Select * from users_table where email=?");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	@Override
	public User addUser(User user) {
		// id | username | password | prfile
		String add_customer = "insert into users_table(username,email,address,phoneNumber) values (?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement(add_customer, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(4, user.getPhoneNumber());

			int noOfRowsEffected = pstmt.executeUpdate();

			if (noOfRowsEffected > 0) {
				ResultSet rs = pstmt.getGeneratedKeys();
				rs.next();
				user.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void updateUser(int id, String username, String address, String phoneNumber) {

		try {
			String update_book_query = "update users_table set username=?,address=? , phoneNumber=? where id=?";
			PreparedStatement pstmt = connection.prepareStatement(update_book_query);
			pstmt.setString(1, username);
			pstmt.setString(2, address);
			pstmt.setString(3, phoneNumber);

			pstmt.setInt(4, id);
			int noOfRowsEffected = pstmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();

		User tempUser;
		try {
			String all_users_query = "select * from users_table";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(all_users_query);
			while (rs.next()) {
				tempUser = new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("address"), rs.getString("phoneNumber"));

				list.add(tempUser);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return list;
	}

}
