package com.jdbc;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudMenu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		Connection con = null;

		try {

			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			// Get a connection to the database
			con = DriverManager.getConnection(url, un, pwd);
			System.out.println("Connection Established");

			// user input choice
			while (true) {
				System.out.println("\nChoose an option (1-5):");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Select");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");

				// handle the user choice
				int choice;
				try {
					choice = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a number between 1 and 5.");
					scan.nextLine();
					continue;
				}

				// select the choice option and invalid scenario
				switch (choice) {
				case 1:
					insertData(con, scan);
					break;
				case 2:
					updateData(con, scan);
					break;
				case 3:
					deleteData(con, scan);
					break;
				case 4:
					selectData(con);
					break;
				case 5:
					System.out.println("Transcation complete Thank you.");
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}

			// driver and connection related exception
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		} catch (SQLException e) {
			System.out.println("Connection not Established");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// Insert option
	private static void insertData(Connection con, Scanner scan) throws SQLException {
		String selectSQL = "SELECT * FROM emp";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(selectSQL);

		displayResultSet(res);

		String insertSQL = "INSERT INTO emp (name, desig, salary) VALUES (?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(insertSQL);

		do {
			System.out.println("Enter Name:");
			String name = scan.next();

			System.out.println("Enter Designation:");
			String desig = scan.next();

			int salary;
			while (true) {
				try {
					System.out.println("Enter Salary:");
					salary = scan.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid integer for salary.");
					scan.nextLine(); // Clear invalid input
				}
			}

			pstmt.setString(1, name);
			pstmt.setString(2, desig);
			pstmt.setInt(3, salary);

			pstmt.executeUpdate();
			System.out.println("Data inserted successfully.");

			System.out.println("Do you want to insert more data? (yes/no)");
		} while (scan.next().equalsIgnoreCase("yes"));

		res = stmt.executeQuery(selectSQL);
		System.out.println("Updated Data:");
		displayResultSet(res);
	}

	// update option
	private static void updateData(Connection con, Scanner scan) throws SQLException {
		// Display existing data
		String selectSQL = "SELECT * FROM emp";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(selectSQL);

		displayResultSet(res);

		String updateNameSQL = "UPDATE emp SET name = ? WHERE id = ?";
		String updateSalarySQL = "UPDATE emp SET salary = ? WHERE id = ?";
		String updateDesignationSQL = "UPDATE emp SET desig = ? WHERE id = ?";
		PreparedStatement pstmtName = con.prepareStatement(updateNameSQL);
		PreparedStatement pstmtSalary = con.prepareStatement(updateSalarySQL);
		PreparedStatement pstmtDesignation = con.prepareStatement(updateDesignationSQL);

		do {
			int id;
			while (true) {
				try {
					System.out.print("Enter Employee ID to update: ");
					id = scan.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid integer for ID.");
					scan.nextLine(); // Clear invalid input
				}
			}

			System.out.println("What would you like to update?");
			System.out.println("1. Name");
			System.out.println("2. Salary");
			System.out.println("3. Designation");
			System.out.print("Enter your choice (1, 2, or 3): ");

			int choice;
			while (true) {
				try {
					choice = scan.nextInt();
					if (choice >= 1 && choice <= 3) {
						break;
					} else {
						System.out.println("Invalid choice. Please enter 1, 2, or 3.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter 1, 2, or 3.");
					scan.nextLine(); // Clear invalid input
				}
			}

			switch (choice) {
			case 1: // Update Name
				System.out.print("Enter new Name: ");
				scan.nextLine(); // Consume the newline left by nextInt
				String name = scan.nextLine();

				pstmtName.setString(1, name);
				pstmtName.setInt(2, id);

				int nameRowsAffected = pstmtName.executeUpdate();
				if (nameRowsAffected > 0) {
					System.out.println("Name updated successfully.");
				} else {
					System.out.println("No record found with the given ID.");
				}
				break;

			case 2: // Update Salary
				int salary;
				while (true) {
					try {
						System.out.print("Enter new Salary: ");
						salary = scan.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter a valid integer for salary.");
						scan.nextLine(); // Clear invalid input
					}
				}

				pstmtSalary.setInt(1, salary);
				pstmtSalary.setInt(2, id);

				int salaryRowsAffected = pstmtSalary.executeUpdate();
				if (salaryRowsAffected > 0) {
					System.out.println("Salary updated successfully.");
				} else {
					System.out.println("No record found with the given ID.");
				}
				break;

			case 3: // Update Designation
				System.out.print("Enter new Designation: ");
				scan.nextLine(); // Consume the newline left by nextInt
				String desig = scan.nextLine();

				pstmtDesignation.setString(1, desig);
				pstmtDesignation.setInt(2, id);

				int desigRowsAffected = pstmtDesignation.executeUpdate();
				if (desigRowsAffected > 0) {
					System.out.println("Designation updated successfully.");
				} else {
					System.out.println("No record found with the given ID.");
				}
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}

			System.out.print("Do you want to update more data? (yes/no): ");
		} while (scan.next().equalsIgnoreCase("yes"));

		// Display updated data
		res = stmt.executeQuery(selectSQL);
		System.out.println("Updated Data:");
		displayResultSet(res);
	}

	// Delete option
	private static void deleteData(Connection con, Scanner scan) throws SQLException {
		String selectSQL = "SELECT * FROM emp";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(selectSQL);

		System.out.println("Current Data:");
		displayResultSet(res);

		String deleteSQL = "DELETE FROM emp WHERE id = ?";
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);

		do {
			int id;
			while (true) {
				try {
					System.out.println("Enter Employee ID to delete:");
					id = scan.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid integer for ID.");
					scan.nextLine(); // Clear invalid input
				}
			}

			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("Data deleted successfully.");

			System.out.println("Do you want to delete more data? (yes/no)");
		} while (scan.next().equalsIgnoreCase("yes"));

		res = stmt.executeQuery(selectSQL);
		System.out.println("Updated Data:");
		displayResultSet(res);
	}

	// select option
	private static void selectData(Connection con) throws SQLException {
		String selectSQL = "SELECT * FROM emp";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(selectSQL);

		displayResultSet(res);
	}

	// display the db data
	private static void displayResultSet(ResultSet res) throws SQLException {
		System.out.println("----------------------------------------------");
		System.out.printf("| %-3s | %-10s | %-10s | %-10s |%n", "ID", "Name", "Desig", "Salary");
		System.out.println("----------------------------------------------");

		while (res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			String desig = res.getString("desig");
			int salary = res.getInt("salary");

			System.out.printf("| %-3d | %-10s | %-10s | %-10d |%n", id, name, desig, salary);
		}
		System.out.println("----------------------------------------------");

	}
}
