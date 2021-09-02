package com.demo.dao;

public class User {
	private int id;
	private String username;
	private String email;
	private String address;
	private String phoneNumber;

	public User() {
	}

	public User(String username, String email, String address, String phoneNumber) {
		this.username = username;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public User(int id, String username, String email, String address, String phoneNumber) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
