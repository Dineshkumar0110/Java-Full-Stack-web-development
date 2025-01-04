package programming;

import java.util.Scanner;

public class Day05 {
	
	
	//logic with the method  factorial 
//	same like as a main method 
//	steps
//	1. method name 
//	2. parameter & data type
//	3. logic 
//	4. return type 
//	5. public
//	public static void printFactors(int n){
//		
//		for (int i = 1; i <=  n; i++) {
//
//			if (n % i == 0) {
//
//				System.out.println(i);
//			}
//		}	
//	}
//		explanation: 8 = n  , i = 1,2,3...n  8%i = 8  factorial	
	
	
//	print number of factor of n
	
//	public static int countFactors(int n) {
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		return count;
////		System.out.println(count);
//	}
	
	
	
//	check whether prime method1
	public static  boolean checkPrime(int n){
		 int count = 0;
			for (int i = 1; i* i <= n; i++)  // i < = n/2  not best approach
			{
				if (n % i == 0) 
				{
//					count++;
//					return "not prime";
					return false;
				}
			}
//			return "prime";
			return true;
//			System.out.println(count);
		
	
//		if(count == 0) {    == 2 is not better approach 
//			return "prime";
//		}
//		else {
//			return "not prime";
//		}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Input
		int n = scan.nextInt();
		
		
//		output 
//		method1
//		Day05 d5 = new Day05(); creating object and calling other disadvantage
//		d5.printFactors(n);
//		static before void dont create static and instance instance create object 
//		printFactors(n); 
//		 int res = countFactors(n);
//		 System.out.println(res);
		
		
//		String res = checkPrime(n);
		boolean res = checkPrime(n);
		System.out.println(res);
	}

}
