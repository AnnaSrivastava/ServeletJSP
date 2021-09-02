package com.studentapp.dao.factory;

import java.sql.*;
import java.util.Properties;
import java.io.*;

import com.studentapp.AddStudentController;

public class ConnectionFactory {

	private static Connection connection = null;

	public ConnectionFactory() {

	}

	public static Connection getConnection() {
		InputStream inStream = AddStudentController.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();

		try {
			properties.load(inStream);
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		String driverName = properties.getProperty("jdbc.driverName");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
