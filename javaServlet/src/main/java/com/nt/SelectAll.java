package com.nt;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.CountryDAO;
import com.nt.entity.Country;

public class SelectAll extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		CountryDAO dao = new CountryDAO();
		List<Country> list = dao.SelectAll();
						
		req.setAttribute( "list", list );
		RequestDispatcher rd = req.getRequestDispatcher( "displayAll.jsp" );
		rd.forward( req, res );
		
	}

}
