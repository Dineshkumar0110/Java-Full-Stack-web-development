package programming;

import java.util.Scanner;

public class Day23 {
	//String Traversal
		
//	public static int CountSpaces(String s) {
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == ' ') {
//				count++;
//			}
//		}
//		return count;
//
//	}

	
	public static int CountWords(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
//		return count+1;
		return s.charAt(0)==' '? count :count+1;
		
	}
	
	public static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static int countConsontants(String s) {
		int cc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
						|| ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U')) {
					cc++;
				}
			}
		}
		return cc;
	}

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); 
		
//		int res = CountSpaces(s);
//		System.out.println(res);
		
		int res = CountWords(s);
		System.out.println(res);
		
//		int res =countVowels(s);
//		System.out.println(res);
			
//		int res =countConsontants(s);
//		System.out.println(res);
		
		
//		vowels , consonants , words , spaces  
	}
}
