package com.nt;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.CountryDAO;

public class Update extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt( req.getParameter( "t1" ) );
		String code = req.getParameter( "t2" );
		String name = req.getParameter( "t3" );
		
		CountryDAO dao = new CountryDAO();
		boolean isupdated = dao.Update(id, code, name);
		
		if(isupdated == true) {
			req.setAttribute( "msg", "Updation Successfull" );
			RequestDispatcher rd = req.getRequestDispatcher( "success.jsp" );
			rd.forward( req, res );
		}
		else {
			req.setAttribute( "msg", "Record not updated" );
			RequestDispatcher rd = req.getRequestDispatcher( "error.jsp" );
			rd.forward( req, res );
		}
	}

}
