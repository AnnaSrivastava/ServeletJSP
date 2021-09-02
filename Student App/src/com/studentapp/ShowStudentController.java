package com.studentapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.entity.Student;
import com.studentapp.service.StudentService;
import com.studentapp.service.StudentServiceImplJdbc;

public class ShowStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	public ShowStudentController() {
		super();
		studentService = new StudentServiceImplJdbc();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		List<Student> studentList = studentService.getAllStudent();
		request.setAttribute("students", studentList);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
