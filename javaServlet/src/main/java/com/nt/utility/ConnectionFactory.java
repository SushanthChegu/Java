package com.nt.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static Connection con = null;
	
	static{
		
		try {
			Class.forName( "com.mysql.cj.jdbc.Driver" );

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		}catch ( Exception e ) {
		e.printStackTrace();
		}

	}
	
	public Connection getCon() {
		return con;	
	}
}
