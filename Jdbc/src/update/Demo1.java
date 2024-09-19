package update;

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
		
		int rs = st.executeUpdate("UPDATE country SET country_iso_code = 'IN' WHERE country_id = 171");
		
		System.out.println(rs + " record updated");
		
		con.close();

	}

}
