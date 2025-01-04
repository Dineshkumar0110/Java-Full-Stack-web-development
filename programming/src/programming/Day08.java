package programming;

import java.util.Iterator;
import java.util.Scanner;

public class Day08 {
	
	// sum of array
	public static int arraySum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {

			sum = sum * ar[i];
		}

		return (sum);
	}

	// product of array
	public static long arrayProduct(int[] ar) {
		long p = 1;
		for (int i = 0; i < ar.length; i++) {

			p = p * ar[i];
		}

		return (p);
	}
//		The code that exploded a rocket


	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int n  = Scan.nextInt();
		
		 int[] ar =  new int[n];
		 for (int i = 0; i <ar.length ;i++) {
			ar[i]= Scan.nextInt();
		}
//		int res = arraySum(ar);
//		System.out.println(res);
		long res = arrayProduct(ar);
		System.out.println(res);
		
//		for (int i = 0; i < ar.length; i++) {
//		 instead of writing i++, i++ i = i +2
//			if (i % 2 != 0) {
//// 				ar[i] % 2  != 0   odd elements in array
//// 				ar[i] % 2  == 0   even  elements in array
////				i % 2!= 0 find odd index
////				i % 2 == 0 find even, index
//
//				System.out.println(ar[i] + " ");
//			}
//
//		}
		 //reverse of array 
		 //centre to array length/2
		 //array length-1 or -2 
			for (int i = ar.length-1; i >=  0; i--) {		 				
						System.out.println(ar[i] + " ");
					}
	}}
