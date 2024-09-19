package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select country_name From country Where country_id = 142");
		
		if(rs.next()) {
			
			String name = rs.getString("country_name");
			
			System.out.println(name);
		}
		else {
			System.out.println("Id not found");
		}
		
		con.close();

	}

}
