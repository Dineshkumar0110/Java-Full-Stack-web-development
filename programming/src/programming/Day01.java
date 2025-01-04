package programming;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Taking input from the user
		System.out.print("Enter the 1st Input:");
		int a = scan.nextInt();
		System.out.print("Enter the 2nd Input:");
		int b = scan.nextInt();
		System.out.print("Enter the 3rd Input:");
		int c = scan.nextInt();
		
		// small logic 
		int sum1 = a + b ;
		int sum2 = b + c ;
		int sum3 = c + a ;
		
		// printing output
		System.err.print(sum1 + " " + sum2 + " " + " " + sum3);

//		celsius to Fahrenheit
		
		//Taking input from the user
		int i = scan.nextInt();

	    // logic and formula (0°C × 9/5) + 32 = 32°F
		 float result = (i * 9.0f/5) + 32 ;
		 
		 //printing output
		 System.out.println(result);
		 	
        scan.close(); // closing all the resource 
	}

}
