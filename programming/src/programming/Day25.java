package programming;

import java.util.Scanner;

public class Day25 {

	
	
	public static String toLowerCase(String s) {
		
		String t = "";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				t = t + (char) (ch + 32);

			} else {
				t = t + ch;
			}

		}
		return t;
	}
	
	
	
public static String swapCases(String s) {
		
		String t = "";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				t = t + (char) (ch + 32);

			} else if (ch >= 'a' && ch <= 'z') {
				
				t = t + (char) (ch - 32);
				
			}
			else{
				t = t + ch;
			}
			
		}
		return t;
	}


     public static String trimSpaces(String s){
	
	int si = 0, ei = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) != ' ') {
			si = i;
			break;
		}
	}


	for(int i= s.length()-1; i >= 0; i--)
	{
		if (s.charAt(i) != ' ') {
			ei = i;
			break;
		}
	}
	
	
	String t = "";
	for (int i = si; i <= ei; i++) {
		t = t + s.charAt(i);
	}
	return t;
}
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		
//		String res = toLowerCase(s);
//		System.out.println(res);
//		
//		String res = swapCases(s);
//		System.out.println(res);
//		

		String res = trimSpaces(s);
		System.out.println(res);
	}
}

