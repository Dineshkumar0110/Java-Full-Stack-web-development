package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sound.midi.Receiver;

public class Acid {

	private static Connection connection;
	private static PreparedStatement statement;
	static final String SQL = "UPDATE `emp` SET `salary` = `salary` + ? WHERE `name`= ?";
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		try {
			connection = DriverManager.getConnection(url, un, pwd);
			connection.setAutoCommit(false);
			transcation();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	static void transcation() throws SQLException {
		System.out.println("Enter senders name: ");
		String sender = scan.next();

		System.out.println("Enter Receivers name:");
		String receive = scan.next();

		System.out.println("Enter Amount");
		int amount = scan.nextInt();

		int i = updateSalary(sender, -amount);
		int j = updateSalary(receive, amount);
		
		if (isConfirm(i,j)) {
			System.out.println("Transcation successs");
			connection.commit();
		} else {
			System.out.println("Transcation Failure");
			connection.rollback();
		}
	}

	
	static int updateSalary(String user, int amount) throws SQLException {

		statement = connection.prepareStatement(SQL);
		statement.setInt(1, amount);
		statement.setString(2, user);

		int i = statement.executeUpdate();
		return i;
	}

	
	static boolean isConfirm(int i, int j){
		System.out.println("Do you want to confirm the transcation? (yes/no)");
		String choice = scan.next();
		return choice .equalsIgnoreCase("yes") &&	i==1 && j==1;
	}
	

}