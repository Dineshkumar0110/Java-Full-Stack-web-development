package programming;

import java.util.Scanner;

public class Day10 {
	
	// find the element index  linear search program 
//	public static  int search(int[] ar, int k){
//		 for (int i = 0; i < ar.length; i++) {
//			
//			 if (ar[i] == k) {
//				return i;
//			}
//		}
//		 return -1;
//	 }
	
//	sum-max 
//	sum-min
	
	
//	public static int max(int[] ar) {
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
//
//	public static int min(int[] ar) {
//		int min = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if (min > ar[i]) {
//				ar[i] = min;
//			}
//		}
//		return min;
//	}
//
//	public static int sum(int[] ar) {
//		int sum = 0;
//		for (int i = 0; i < ar.length; i++) {
//
//			sum = sum + ar[i];
//		}
//
//		return sum;
//	}
	
	
	
//	product of array
//	5
//	3 4 1 2 5
//	40 
//	30 
//	120 
//	60 
//	24 
//	public static int[] productArray(int[] ar)
//	{
//	    int[] res = new int[ar.length];
//	    int p = 1 ;
//	    for (int i = 0; i < res.length; i++) {
//			p = p * ar[i];
//		}
//	    for (int i = 0; i < res.length; i++) {
//			res[i] = p/ar[i];
//		}
//	    
//	    return res;
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
//		int k = scan.nextInt();

//		int res=  search(ar, k);    
//		System.out.println(res);
//		    int sum= sum(ar);
//		    int max= max(ar);
//		    int min= min(ar);
//		     
//		     System.out.println(sum-max);
//		     System.out.println(sum-min);
		
//		int[] res = productArray(ar);
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i]+ " ");   
//			
//		}
		     
		     }

}
