package com.studentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.studentapp.dao.factory.ConnectionFactory;
import com.studentapp.entity.Student;

public class StudentDaoImplJdbc implements StudentDao {

	private Connection connection;

	public StudentDaoImplJdbc() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public Student addStudent(Student student) {

		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("insert into students values(?,?,?,?)");
			pstmt.setString(1, student.getStud_id());
			pstmt.setString(2, student.getStud_name());
			pstmt.setString(3, student.getStream());
			pstmt.setDouble(4, student.getPercentage());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		PreparedStatement pstmt;
		List<Student> studentList = new ArrayList<>();
		try {
			pstmt = connection.prepareStatement("select * from students");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Student student = new Student(rs.getString("stud_id"), rs.getString("stud_name"),
						rs.getString("stream"), rs.getDouble("percentage"));
				studentList.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studentList;
	}

}
