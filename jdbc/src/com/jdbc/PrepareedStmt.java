package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareedStmt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;

		try {

			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			// 2. get a connection to database
			con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");

			// 3. create a sql statement
			String query = "SELECT * from emp where`desig` = ?";
			stmt = con.prepareStatement(query);

			System.out.println("Enter the Department name:");
			String s1 = scan.next();
			stmt.setString(1, s1);

			// 4. exceute a sql statement
			res = stmt.executeQuery();
			// no data in db then throw error
			System.out.println("Query executed");

			// 5. process the result
			// Retervive from the row number
			System.out.println("------------------------------");
			while (res.next() == true) {

				int id = res.getInt("id");
				String name = res.getString("name");
				String desig = res.getString("desig");
				int salary = res.getInt("salary");
				System.out.printf("| %d  |%-6s |%-5s|%3d |\n", id, name, desig, salary); // get align the data as db

			}
			System.out.println("----------------------------");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		} catch (SQLException e) {
			// while print below statement table wrong in query
			System.out.println("Connection not Established");
		}

		// 6. close the connection
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

// Prepared statemet : Incomplete query 
//change the variable name in local variable
// ? place holder
// Taking input from the user 
//remove parameter from the stmt.executeQuery();