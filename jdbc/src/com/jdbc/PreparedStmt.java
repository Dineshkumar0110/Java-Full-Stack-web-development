package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		PreparedStatement stmt = null;
		PreparedStatement selectStmt = null;
		ResultSet res = null;
		Connection con = null;

		try {

			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			// 2. get a connection to database
			con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");

			// 3. create a insert sql statement
			String SQL = "Update `emp` SET `Salary`= `Salary` + ? WHERE `desig` = ?";
			stmt = con.prepareStatement(SQL);
			System.out.println("Enter the Increment value:");

			int inc = scan.nextInt();
			System.out.println("Enter the Department");
			String dept = scan.next();

			stmt.setInt(1, inc);
			stmt.setString(2, dept);

			// 4. execute the query
			int i = stmt.executeUpdate();
			System.out.println(i + "rows effected" );

//			display the updated data in the db

			String selectSQL = "SELECT * FROM emp WHERE `desig` = ?";
			selectStmt = con.prepareStatement(selectSQL);
			selectStmt.setString(1, dept);

			res = selectStmt.executeQuery();

			System.out.println("------------------------------");
			System.out.printf("| %-3s | %-10s | %-10s | %-6s |\n", "ID", "Name", "Desig", "Salary");
			System.out.println("------------------------------");
			while (res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				String desig = res.getString("desig");
				int salary = res.getInt("salary");

				System.out.printf("| %-3d | %-10s | %-10s | %-6d |\n", id, name, desig, salary);
			}
			System.out.println("------------------------------");

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
