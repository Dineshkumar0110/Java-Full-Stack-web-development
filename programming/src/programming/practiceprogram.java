package programming;

import java.util.Scanner;

public class practiceprogram {

//	public static int isVowels(String S) {
//
//		int count = 0;
//		for (int i = 0; i < S.length(); i++) {
//			if (S.charAt(i) != ' ') {
//				
//				count++;
//			}
//
//		}
//		return count;
//	}
	
	public static void isVowels(String S) {
		String t = " ";
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				t = t + (ch);

			}
			return;
		}

	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = scan.nextInt();
////			System.out.println(ar[i]);
//		}
		String S = scan.nextLine();
		
		
		 isVowels(S);
	}

}
