package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FlowerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write("Flower Page Controller");
		int flowersQuantity = Integer.valueOf(request.getParameter("flowersQuantity"));
		HttpSession session = request.getSession();		
		session.setAttribute("flowersQuantity", flowersQuantity);
		response.sendRedirect("home.jsp");
	}

}
