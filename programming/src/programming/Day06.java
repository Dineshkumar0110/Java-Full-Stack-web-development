package programming;

import java.util.Scanner;

public class Day06 {
	
//	check prime optimal way
	public static boolean checkPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

//	2 to 10 between prime number 
	public static void printPrimes(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	// print first 5 prime number
	public static void printPrimes(int n) {
		int count = 0;
		for (int i = 2; count <= n; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
				count++;
			}

		}
	}

//    print multiples 10 till 30
//	  30
//	  10
//	  10 20 30
	public static void printMultiples(int x, int n) {

		for (int i = 1; i <= x; i++) {

			if (i % n == 0) {
				System.out.println(i);
			}
		}
	}
	
	// print multiples 10 till a and b values
	public static void printMultiples(int n, int a, int b) {

		for (int i = 1; i <= n; i++) {

			if (i % a == 0 && i % b == 0) {
				System.out.println(i);
			}
		}
	}

//	common factors HCF to find between two number
	public static void printCommonFactors(int n1, int n2) {
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
//				break;
			}
		}
	}
// common factors LCM to find between two number 
	public static void printLCM(int n1, int n2) {
		int max = (n1 > n2) ? n1 : n2;
		for (int i = max;; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//	int n1 = scan.nextInt();
//	int n2 = scan.nextInt();
//	printPrimes(n1 , n2 );

//	int n = scan.nextInt();
//	printPrimes(n);

//	int x = scan.nextInt();
//	int n = scan.nextInt();
//	printMultiples(x,n);
//
//		int n = scan.nextInt();
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//
//		printMultiples(n, a, b);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		printLCM(n1, n2);

	}
}
