package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		PreparedStatement stmt = null;
		PreparedStatement selectStmt = null;
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
			String SQL = "INSERT into `emp`(`id`, `name`, `desig`, `salary`) values (?, ?, ?, ?)";
			stmt = con.prepareStatement(SQL);
			
			
			do {
				
				// user input 
				System.out.println("Enter ID:");
				int id = scan.nextInt();
				System.out.println("Enter Name:");
				String name = scan.next();
				System.out.println("Enter Desig:");
				String Desig = scan.next();
				System.out.println("Enter Salary:");
				int Salary = scan.nextInt();

				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, Desig);
				stmt.setInt(4, Salary);
				
			
				// 4. execute the query
//				int i = stmt.executeUpdate();
//				System.out.println(i + "rows effected");
				stmt.addBatch();
				System.out.println("Do you want to enter more employee? (yes/no)");
				
				
			} while (scan.next().equalsIgnoreCase("yes"));
			
			int[] ar = stmt.executeBatch();
			System.out.println();
			for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i] + " ");
			}
			
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

//Batch file use add query multiple times 
//stmt.addBatch();
//stmt.executeBatch();
