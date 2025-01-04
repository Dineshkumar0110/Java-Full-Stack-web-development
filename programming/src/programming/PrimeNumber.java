package programming;

import java.util.Scanner;

public class PrimeNumber {
	
	
	
	public static boolean isprime(int n) {
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scan =	new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(isprime(n));
		
	}

}


//Explaination :
//A number divisible by it self and 1
//1 is a composite nor prime number


//Algorithm

//given a number n
//for i = 2 to n/2
//  if n % i == 0:
//	  return false
//return true



