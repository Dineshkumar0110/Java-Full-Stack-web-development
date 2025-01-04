package programming;

import java.util.Scanner;

public class Day22 {

//	public static String reverse(String s){
//       String t = "";
//       for (int i = s.length()-1; i >= 0; i--) {
//			
////			System.out.print(s.charAt(i));
////			System.out.println(t);
//			t = t + s.charAt(i); 
//			
//		}
//       
//       return t;
//	}
	
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

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		String s = scan.next();   this not work large 1 more word
		String s = scan.nextLine(); 
		
		
//		String res = reverse(s);
		boolean res = isPalidrome(s);
		System.out.println(res);
//		if (s.equals(res)) {        // == check refernce then object wrong answer
//			System.out.println("palidrome");
//		} else {
//
//			System.out.println("not palidrome");
//		}
//		System.out.println(res);
	
	}

}


//		String Intro
//		String is Sequence of character
//		object of class is immutable in string .
//		create a mutable string by using string bulider and buffer.
//		string user input next() -> 1 word or nextline() -> 1 or more words
//         + addition, concat

//		 1  +  1  =  2
//		"1" +  1  = "11"  
//		 1	+ "1" = "11"  
//		"1" + "1" = "11" 
// string can one or both can do concat then ans string 
// all primitive datatype can do addition 

//		1  +  1 +  1  =  3
//		1  +  1 + "1" = "21"
//	   "1" +  1 +  1  = "111"
//		1  + "1"+ "1" = "111"
//	   "1" +  1 + "1" = "111"

//		array or string or arraylist index starts 0
//		index of  method inside string class one method s.charAt(0)