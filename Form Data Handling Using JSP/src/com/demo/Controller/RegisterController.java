package com.demo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dao.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public boolean checkEmpty(String str) {
		return str.equals("");
	}

	private UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		System.out.println(action);

		if (action.equals("updateUser")) {
			HttpSession session = req.getSession();
			User user = (User) session.getAttribute("user");
			userService.updateUser(user.getId(), user.getUsername(), user.getAddress(), user.getPhoneNumber());
		}
		
		List<User> usersList=userService.getAllUser();
		req.setAttribute("usersList", usersList);
		req.getRequestDispatcher("showAll.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");

		if (!checkEmpty(username) && !checkEmpty(email) && !checkEmpty(address) && !checkEmpty(phoneNumber)) {
			int id = userService.findUserByEmail(email);
			if (id != -1) {
				// Already existing user
				HttpSession session = request.getSession();
				User user = new User(id, username, email, address, phoneNumber);
				session.setAttribute("user", user);
				response.sendRedirect("option.jsp");
			} else {
				User user = new User(username, email, address, phoneNumber);
				userService.addUser(user);
				response.sendRedirect("RegisterController?action=showAll");
			}
		} else {
			response.sendRedirect("register.jsp?message=Registration failed");
		}

	}

}
