package programming;

import java.util.Scanner;

public class Day26 {
	
	//remove , replace , add 
	
	public static String addCharacter(String s){
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'A') {
				t = t + '*' + ch;	
			} else {
				t = t  + ch;
			}
		}
		return t;
	}
	
	
	
	public static int indexOf(String s, char k){
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i)== k) {
				return i;
			}
			
		}
		return -1;
		
		
	}
	

	public static String findString(String s, String t) {

		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j == t.length()? "yes": "no";
	}
		
		
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();	
		String t = scan.nextLine();	
		
//		String res = addCharacter(s);
//		System.out.println(res);

//		char  k = scan.next().charAt(0);
//		int res= indexOf(s, k);
//		System.out.println(res);
		
		String res= findString(s,t);
		System.out.println(res);
		
	}




}
