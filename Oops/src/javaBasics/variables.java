package javaBasics;

import java.util.Scanner;

public class variables {

	// Instance variable
//		The variables which will get created
//	    inside the class outside the methods are called instance variables
	int a = 5; // 0
	float b = 5.5f; // 0.0
	double c = 10.00; // 0.0
	String d = "abcd"; // null
	boolean e = true; // false

	public static void main(String[] args) {
		// local variable:
//		The variables which will be  created 
//		inside the class inside the methods are called local variables

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the cost");
//		int cost = scan.nextInt();
//		
//		System.out.println("Enter the meliage");
//		float meliage = scan.nextFloat();
//		
//		System.out.println("Enter the car");
//		String car = scan.next();	
//		
//		System.out.println("gear car or not");
//		boolean Gear = scan.nextBoolean();
//		
//		System.out.println("---------------------");
//		System.out.println(cost);
//		System.out.println(meliage);
//		System.out.println(car);
//		System.out.println(Gear);
//		System.out.println("---------------------");

		variables v1 = new variables();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println(v1.c);
		System.out.println(v1.d);
		System.out.println(v1.e);

	}

}

//A variable is a container which holds the value while the Java program is executed. A 
//variable is assigned with a data type.
