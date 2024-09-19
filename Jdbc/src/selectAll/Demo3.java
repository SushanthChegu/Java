package selectAll;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		CallableStatement cs = con.prepareCall("Select * from country");
		
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("country_id");
			String code = rs.getString("country_iso_code");
			String name = rs.getString("country_name");
			
			System.out.println(id + " "+ code + " " + name);
		}
		
		con.close();

	}

}
