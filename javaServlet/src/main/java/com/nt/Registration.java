package com.nt;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.CountryDAO;
import com.nt.entity.Country;

public class Registration extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt( req.getParameter( "t1" ) );
		String code = req.getParameter( "t2" );
		String name = req.getParameter( "t3" );
		
		Country c =  new Country(id, code, name);
		
		CountryDAO dao = new CountryDAO();
		boolean isadded = dao.Register(c);
		
		if(isadded == true) {
			req.setAttribute( "msg", "Registration Successfull" );
			RequestDispatcher rd = req.getRequestDispatcher( "success.jsp" );
			rd.forward( req, res );
		}
		else {
			req.setAttribute( "msg", "Record not added" );
			RequestDispatcher rd = req.getRequestDispatcher( "error.jsp" );
			rd.forward( req, res );
		}
	}
	
	

}
