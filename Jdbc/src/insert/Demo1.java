package insert;

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
		
		int rs = st.executeUpdate("INSERT into country values(216, 'BGK', 'Bangkok')");
		
		System.out.println(rs + " record updated");
		
		con.close();

	}

}
