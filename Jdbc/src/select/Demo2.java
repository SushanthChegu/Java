package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("Select country_name from country Where country_id = ?");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id");
		
		int id = s.nextInt();
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString("country_name");
			
			System.out.println(name);
		}
		else {
			System.out.println("Id not sound");
		}
		
		con.close();

	}

}
