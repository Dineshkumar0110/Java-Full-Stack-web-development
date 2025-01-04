package programming;

import java.util.Scanner;

public class RearrangeArray {

//	public static void rearrangeArray(int[] ar) {
//
//		int i = ar.length - 1, j = ar.length - 1;
//
//		while (i >= 0) {
//			if (ar[i] == -1) {
//				i--;
//
//			} else {
//				ar[j--] = ar[i];
//				i--;
//			}
//
//		}
//		while (j >= 0) {
//			ar[j--] = -1;
//		}
//
//	}
	
	
	
	
	
	public static void Arrange(int[] ar) {

		int i = ar.length - 1, j = ar.length - 1;

		while (i <= ar.length) {
			if (ar[i] == 0) {
				i++;

			} else {
				ar[j] = ar[i];
				i++;
				j++;
			}

		}
		while (j <= ar.length) {
			ar[j] = 0 ;
			j++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

//		rearrangeArray(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
