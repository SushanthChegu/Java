package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InboxServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie[] ck = req.getCookies();
		String username = null;
		if(ck != null) {
			for (Cookie c : ck) {
				if(c.getName().equals("User")) {
					username = c.getValue();
				}
			}
		}
		if(username == null || username == "") {
			req.setAttribute("errorMsg", "User not Logged In");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);	
		}else {
			req.setAttribute("loginUser", username);
			RequestDispatcher rd = req.getRequestDispatcher("inbox.jsp");
			rd.forward(req, res);
		}

	}
	

}
