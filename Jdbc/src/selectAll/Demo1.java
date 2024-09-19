package selectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from country");
		
		while (rs.next()) {
			int id = rs.getInt("country_id");
			String code = rs.getString("country_iso_code");
			String name = rs.getString("country_name");
			
			System.out.println(id + " "+ code + " " + name);
			}
		
		
		
		//String Sql = "DELETE FROM country WHERE country_id = 216";
		
		//String Sql = "UPDATE country SET country_iso_code = 'IND' WHERE country_id = 171";
		
		
		
		//int result = st.executeUpdate(Sql);
		
		//System.out.println(result + "record updated");
		
		con.close();

	}

}
