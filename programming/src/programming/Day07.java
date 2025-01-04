package programming;

import java.util.Iterator;
import java.util.Scanner;

public class Day07 {

//              counting all the digits in - & +
//	public static int countdigits(int n){
//		
//		int count = 0;
//		while (n!= 0) //for(;n>0;)
//		{
//			n = n/10;
//			count++;		
//		}
//		return count;	
//	}

	// count sum of digits of n
//	public static int sumOfDigits(int n) {
//
//		int sum = 0, rem = 0;
//		while (n != 0) // for(;n>0;)
//		{
//			rem = n % 10;
//			if (rem % 2 == 0) { //even of count 
//				sum = sum + rem;
//			}
//			n = n / 10;
//		}
//		return sum;
//	}

//	reverse the number 54321 ---12345
//	logic n 5217  rev 0  last 7
//	      n 0      rev 5217 n*10 +1  last 2
//	in single shot palindrome
//
	public static int reverseOrder(int n) {
		int rev = 0, last = 0;
		while (n != 0) // for(;n>0;)
		{
			last = n % 10;
			rev = rev * 10 + last;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Array Size input
		int n = scan.nextInt();

//		int res = countdigits(n);
//		System.out.println(res);

//		int res =sumOfDigits(n);
//		System.out.println(res);

		int res = reverseOrder(n);
		System.out.println(res);
		System.out.println(n == res ? "palindrome" : "notpalidrome");

//		array intro program
//	1.	array is object created in heap memory 
//		 0 1 2 3 4 
//	ar ->0 0 0 0 0
//		syntax of 1 d 
//		int [] ar = new int[5];     0  default  ar[0] accesing 
//		float [] ar = new float[5]; 0.0 default
//		boolean [] ar = new boolean[5]; false default
//		String  [] ar = new String[5]; null default

////		Creating  a  array
//		int ar[] = new int[n];
//
////		input for array
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
//
////		printing elements of array
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//
//		}
	}

}
