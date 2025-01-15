package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		
		// api:vendor:ip:portno:db
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			// 2. get a connection to database
			con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");

			// 3. create a sql statement
			stmt = con.createStatement();
			String query = "select * from emp";

			//4. exceute a sql statement 
			res = stmt.executeQuery(query);
			// no data in db then throw error
			System.out.println("Query executed");
			
			
            //5. process the result
			// Retervive from the row number
			System.out.println("------------------------------");
			while (res.next() == true) {

					int id  = res.getInt("id");
					String name = res.getString("name");
					String desig = res.getString("desig");
					int salary = res.getInt("salary");
//					System.out.println(id +" " +name+ " "  + desig + " "+ salary);
					System.out.printf("| %d  |%-6s |%-5s|%3d |\n",id, name,desig, salary); // get align the data as db
					// Retervive from the column number
//			 res.next();
//			 System.out.println(res.getInt("id") + " " + res.getString("name") + " "
//			 + res.getString("dsig") + " " + res.getInt("salary"));
			}
			System.out.println("----------------------------");
			
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		} catch (SQLException e) {
			// while print below statement table wrong in query
			System.out.println("Connection not Established");
		}
		
		
		
//		6. close the connection
		finally {
			try {
				res.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}
		
		
	}
}