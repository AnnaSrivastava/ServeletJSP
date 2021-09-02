package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write("Card Page Controller");
		int cardsQuantity = Integer.valueOf(request.getParameter("cardsQuantity"));
		HttpSession session = request.getSession();		
		session.setAttribute("cardsQuantity", cardsQuantity);
		response.sendRedirect("home.jsp");
		
	}

}
