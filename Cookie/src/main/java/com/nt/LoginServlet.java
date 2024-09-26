package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("t1");
		String password = req.getParameter("t2");
		
		if(username.equals(password)) {
			
			Cookie ck1 = new Cookie("Role", "HR");
			Cookie ck2 = new Cookie("User", username);
			res.addCookie(ck1);
			res.addCookie(ck2);
			
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp"); 
			rd.forward(req, res);			
		}
		else {
			req.setAttribute("errorMsg", "Invalid Credentials");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
		
	}
	
	

}
