package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		

		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";
		
		Statement stmt = null;
//		ResultSet res = null;
		Connection con = null;

		try {
			
			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			// 2. get a connection to database
			con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");
			
			
			
			// 3. create a insert sql statement
			stmt = con.createStatement();
			String SQL = "Update `emp` SET `Salary`= `Salary` + 5000 WHERE `desig` = 'se'";
			
            // 4. execute the query
			int i  = stmt.executeUpdate(SQL);
			System.out.println(i);
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		} catch (SQLException e) {
			// while print below statement table wrong in query
			System.out.println("Connection not Established");
		}
		
		
		// 5. close the connection
		finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 
		

		
	}
}

//SQL = "Update `employee` SET `salary` = `salary` + 500 WHERE `department` = `finance`";

