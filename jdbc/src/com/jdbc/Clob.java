package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Clob {

	private static Connection connection;
	private static PreparedStatement statement;
	private static FileReader fr;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String SQL = "UPDATE `emp` SET `Introl` = ? WHERE id = ? ";
		String PATH = "C:\\Users\\Prodian\\jdbc\\Images\\myIntro.txt";

		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";

		try {
			connection = DriverManager.getConnection(url, un, pwd);

			statement = connection.prepareStatement(SQL);
			System.out.println("Enter ID: ");
			statement.setInt(2, scan.nextInt());

			fr = new FileReader(PATH);

			statement.setCharacterStream(1, fr);
			int i = statement.executeUpdate();
			System.out.println(i);

		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
