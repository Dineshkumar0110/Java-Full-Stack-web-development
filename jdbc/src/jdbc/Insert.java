package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
public static void main(String[] args) {
		
		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		try {

			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			// 2. get a connection to database
			Connection con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");
			
			// 3. create a sql statement
			 Statement stmt = con.createStatement();
			 String query = "select * from emp";
			 
//			//4. exceute a sql statement 
			 ResultSet res = stmt.executeQuery(query);
			
			 // no data in db then throw error 
			 System.out.println("Query executed");
			 
			 //Retervive from the row number
			 while(res.next()== true) {
			 System.out.println(res.getInt(1) + " " + res.getString(2) + " "
			 + res.getString(3) + " " + res.getInt(4));
			
			 }		 
			
			 
			 
			 //Retervive from the column number
//			 res.next();
//			 System.out.println(res.getInt("id") + " " + res.getString("name") + " "
//			 + res.getString("dsig") + " " + res.getInt("salary"));
			 
			 
			 
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		} catch (SQLException e) {
			// while print below statement table wrong in query
			System.out.println("Connection not Established");
		}
	}

}
