package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("UPDATE country SET country_iso_code = ? WHERE country_id = ?");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id");
		
		int id = s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter code");
		
		String code = s.nextLine();
		
		ps.setString(1, code);
		
		ps.setInt(2, id);
		
		int result = ps.executeUpdate();
		
		System.out.println(result+" Record Updated");
		
		con.close();

	}

}
