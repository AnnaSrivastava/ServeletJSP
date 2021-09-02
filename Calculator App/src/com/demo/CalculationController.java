package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CalculationController")
public class CalculationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculationController() {
		super();
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		double result = 0;

		if (action.equals("add")) {
			result = num1 + num2;
		} else if (action.equals("subtract")) {
			result = num1 - num2;
		} else if (action.equals("multiply")) {
			result = num1 * num2;
		} else if (action.equals("divide")) {
			if (num2 == 0) {
				request.getSession().invalidate();
				response.sendRedirect("index.jsp?message=Divide by zero exception");
				return;
			}
			result = num1 / num2;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("result", result);
		response.sendRedirect("index.jsp");
	}

}
