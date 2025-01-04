package programming;

import java.util.Scanner;

public class Day24 {
	//String manipulation
	
	public static void countCharacter(String s) {
		int vc = 0, cc = 0, nc = 0, spc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vc++;
				} else {
					cc++;
				}
			} else if (ch >= '0' && ch <= '9') {
				nc++;
			} else {
				spc++;
			}
		}
		System.out.println("vc = " + vc);
		System.out.println("cc = " + cc);
		System.out.println("nc = " + nc);
		System.out.println("spc = " + spc);

	}

	public static String  removeSpecialCharacter(String s){
		
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
				t = t+ ch;
			}
		}
		return t;
		
	}
	
	
	public static String removeSpecialCharacters(String s) {

		String t1 = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				t1 = t1 + ch;

			} else if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}
		return t1 + sum;

	}
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
//		countCharacter(s);
		
//		String res = removeSpecialCharacter(s);
//		System.out.println(res);
		
		String res = removeSpecialCharacters(s);
		System.out.println(res);
		
		
		
	}

}
