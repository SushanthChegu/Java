package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		Statement st = con.createStatement();
		
		int rs = st.executeUpdate("DELETE FROM country WHERE country_id = 216");
		
		System.out.println(rs + " record deleted");
		
		con.close();

	}

}
