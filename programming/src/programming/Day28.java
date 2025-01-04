package programming;

import java.util.Scanner;

public class Day28 {
	// String to array
//i/p how are you   o/p how are you print next next line
	
	public static String[] split(String s) {

		String t = "";
		int j = 0;

		int count = countWords(s);
		String[] ar = new String[count];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				t = t + s.charAt(i);
			} else if (t.length() > 0) {

				ar[j] = t;
				j++;
				t = "";
			}
		}
		ar[j] = t;
		return ar;
	}
	
//	counting words
	public static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return s.charAt(0) == ' ' ? count : count + 1;
	}

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String[] res = split(s);
		
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
			
		}
		
		System.out.println();
		for (int i = res.length-1; i >= 0; i--) {
			System.out.print(res[i] + " ");
			
		}
		System.out.println();
		
		
	}

}


//india is my country
//india5 is2 my2 country7
//country my is india
//is india country  my
//aidni si ym yrtnuoc
//yrtnuoc ym si aidni
//india country is my