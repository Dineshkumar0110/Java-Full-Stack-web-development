package programming;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int n = scan.nextInt();
		
		if ( n%2 == 0 && n%5 == 0 && n%10 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
//		instead of using 2 5 10 better approach 10 applicable to all
//		
//		if (n%10 == 0) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("NO");
//		}
//		
////		divisible of 3 and multiple of 3 is same code
//		
//		if (n%3 == 0 || n%7 == 0) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("NO");
//		}
//		
////		end with 0
//		if (n%10 == 0) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("NO");
//		}
//		
////		end with 7
//		if (n%10 == 7 && n%10 == 3) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("NO");
//		}
//		
////		end with 73 yes otherwise no
//		if (n%100 == 73) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("NO");
//		}
//		
////		eliminate the last digit
//		System.out.println(n/10);
//		
//		Scanner.close();
	}

}
