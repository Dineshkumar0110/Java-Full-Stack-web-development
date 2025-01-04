package programming;

import java.util.Scanner;

public class Day27 {
	
	public static boolean isPalidrome(String s) {

		int i = 0, j = s.length() - 1; // temporary space or constant is Auxiliary Space
		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false; // "not palidrome";
			}
		}
		return true; // "palidrome";

	}

	public static void printSubStrings(String s, int size) {
		for (int i = 0; i <= s.length() - size; i++) {
			String t = "";
			for (int j = i; j < i + size; j++) {
				t = t + s.charAt(j);
			}
			if (isPalidrome(t)) {

				System.out.println(t);
			}
		}

	}

	public static void printAllSubStrings(String s) {
		for (int size = 1; size <= s.length(); size++) {
			for (int i = 0; i <= s.length() - size; i++) {
				String t = "";
				for (int j = i; j < i + size; j++) {
					t = t + s.charAt(i);
				}
				System.out.println(t);
			}
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();	
//		int size =scan.nextInt();
//		printSubStrings(s, size);
	
		
		
		printAllSubStrings(s);
		
		
		
	}

}
