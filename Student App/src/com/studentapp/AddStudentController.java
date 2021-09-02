package com.studentapp;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.dao.factory.ConnectionFactory;
import com.studentapp.entity.Student;
import com.studentapp.service.StudentService;
import com.studentapp.service.StudentServiceImplJdbc;

public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentService studentService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		studentService = new StudentServiceImplJdbc();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String stud_id = request.getParameter("stud_id");
		String stud_name = request.getParameter("stud_name");
		String stream = request.getParameter("stream");
		Double percentage = Double.valueOf(request.getParameter("percentage"));

		Student student = new Student(stud_id, stud_name, stream, percentage);
		System.out.println(student);
		Student studentAdded = studentService.addStudent(student);
		if (studentAdded != null) {
			response.getWriter().write("Student Added Successfully");
		}

		response.sendRedirect("showStudents");
	}

}
