package programming;

import java.util.Scanner;

public class SumOfMissingNumber {
	

	public static int missingNumber(int n, int[] ar) {
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0;i<ar.length;i++) {
			sum1 = sum1 +ar[i];
		}
		n = n+1;
		sum2 = n*(n+1);
		int res = sum2 - sum1;
		return res;
	}

	public static void main(String[] args) {
	
		Scanner Scan = new Scanner(System.in);
		int n  = Scan.nextInt();
		int[] ar =  new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Scan.nextInt();
		}
		System.out.println(missingNumber(n,ar));
		

	}

}
