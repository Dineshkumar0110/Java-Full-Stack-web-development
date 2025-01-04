package programming;

import java.util.Scanner;

public class SortingArray {
	
//	
//	
//	public static int sortedArray(int[] ar)
//	{
//		int Largest = ar[0], SecondLargest = Integer.MAX_VALUE;		
//		for (int i = 0; i < ar.length; i++) {
//			if (ar[i]> Largest) {
//				SecondLargest = Largest;
//				Largest =ar[i];
//			} else if(ar[i] > SecondLargest){ 
//				SecondLargest = ar[i];
//			}
//		}
//		return Largest+SecondLargest;
//		
//	}
//	
//	
//	
	
	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = scan.nextInt();
//		}
		

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;

		int max1 = a > b ? a : b;
//		System.out.println(max1);
		int max2 = c > d ? c : d;
//		System.out.println(max2);

		int max3 = max1 > max2 ? max1 : max2;
		System.out.println(max3);
	}

}
