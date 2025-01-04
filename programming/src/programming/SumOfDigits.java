package programming;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		int rem = 0;
		while(n>0) {
			rem =n%10;
			sum = sum + rem;
			n = n/10;
		}
		return sum;
	}
	
	
//	input = 4321 output = 10

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(sumOfDigits(n));
		
	}

}
