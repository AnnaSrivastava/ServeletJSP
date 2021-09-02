package com.demo.dao.factory;

import java.sql.Connection;

public class TestConnection {
	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConnection();
		System.out.println(connection);
	}
}
