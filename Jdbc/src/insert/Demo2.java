package insert;

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
		
		PreparedStatement ps = con.prepareStatement("insert into country values(?,?,?)");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id");
		
		int id = s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter code");
		
		String code = s.nextLine();
		
		System.out.println("Enter name");
		
		String name = s.nextLine();
		
		ps.setInt(1, id);
		ps.setString(2, code);
		ps.setString(3, name);
		
		int Result = ps.executeUpdate();
		
		System.out.println(Result+" record inserted");
		
		con.close();

	}

}
