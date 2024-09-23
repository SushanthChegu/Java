package insert;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
        
        CallableStatement stmt = con.prepareCall("{call add_country(?, ?, ?)}");
        
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id");
		
		int id = s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter code");
		
		String code = s.nextLine();
		
		System.out.println("Enter name");
		
		String name = s.nextLine();
        
        stmt.setInt(1, id);  // country_id
        stmt.setString(2,code);  // country_iso_code
        stmt.setString(3,name);  // country_name
        
        stmt.execute();
        
        System.out.println("Record Inserted");
        con.close();

	}

}
