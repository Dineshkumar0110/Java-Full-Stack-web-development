package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Type;

public class StoredProcedures {
	
	private static  Connection connection;
	private static CallableStatement statement;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// api:vendor:ip:portno:db
		String url = "jdbc:mysql://localhost:3306/employee";
		String un = "root";
		String pwd = "root";
		
		
		try {
			connection = DriverManager.getConnection(url, un, pwd);
		    statement = connection.prepareCall("{call count_emp_salary(?)}");
		    System.out.println("Enter salary:");
		    statement.setString(1, scan.next());
		    statement.registerOutParameter(1, Types.INTEGER);
		    
		    statement.execute();
		    
		    int count = statement.getInt(1);
		    System.out.println(count);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		


	}

}
//q) count no of employees of a specific department
//store procedure 
//multiple query executed in single shot
//create procedure `proceduer name`(parameterin/out/inout)(IN dept varchar(10), out e_count int)
//BEGIN
//	procedure body 
//select count(*) into variablename e_count from employee
//where department = dept
//END