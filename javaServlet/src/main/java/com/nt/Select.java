package com.nt;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.CountryDAO;
import com.nt.entity.Country;

public class Select extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt( req.getParameter( "t1" ) );
	
		CountryDAO dao = new CountryDAO();
		Country c = dao.Select(id);
		if(c == null) {
			req.setAttribute( "msg", "Record not Found" );
			RequestDispatcher rd = req.getRequestDispatcher( "error.jsp" );
			rd.forward( req, res );
		}
		else {
			req.setAttribute( "country", c );
			RequestDispatcher rd = req.getRequestDispatcher( "display.jsp" );
			rd.forward( req, res );	
		}
		
	}
}
