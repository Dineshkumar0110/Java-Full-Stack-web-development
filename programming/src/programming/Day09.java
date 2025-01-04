package programming;

import java.util.Iterator;
import java.util.Scanner;


public class Day09 {
	
	// largest  array or max values in array
	// when give - values it gives the 0  because max 0 is bigger
	// example hr standing offer letter highest package 
//	public static int max(int[] ar) {
////    	int max = Integer.MIN_VALUE;  
//		int max = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//
//			if (ar[i] > max) {
//				max = ar[i];
//			}
//		}
//		return max;
//
//	}
	
	
	//min value in array or smallest value in array
//	public static int min(int[] ar){
////		int min = Integer.MAX_VALUE;
//		int min = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if (min >ar[i]) {
//				ar[i] = min;
//			}
//		}
//		return min;
//	}
	
	// same hr example but not enter the company name 
	// update the package mention company
	
	public static int maxIndex(int[] ar) {
///	int max = Integer.MIN_VALUE;  
	int max = ar[0] , index = 0;

	for (int i = 1; i < ar.length; i++) {
		if (ar[i] > max) {
			max = ar[i];
			index = i;
		}
	}
	return index;
}
	
//	count the repeating number in array input
//	input 
//	5
//	3 7 2 7 1
//	7
//	output
//	2  
	
	public static int Occurance(int[] ar , int k) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == k) {
				count++;
			}	
		}
		return count; 
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		int k = scan.nextInt();
		
//		int res= max(ar);
//		System.out.println(res);
//		
//		int res = min(ar);
//		System.out.println(res);
//		
//		int res =maxIndex(ar);
//		System.out.println(res);
		
		int res = Occurance(ar, k);
		System.out.println(res);
		
	}

}
