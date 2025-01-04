package programming;

import java.util.Scanner;

public class SubArray {


		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int[] ar = new int[n];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=scan.nextInt();
			}
	}
}



//input 
//9
//512493133
//3
//output
//512
//124
//249
//493
//931
//313
//133
