package programming;

import java.util.Scanner;
import java.util.TreeSet;

public class Day30 {
	// programs on set & map 
	
	// remove duplicate integer
	public static void removeduplicate(int[] ar){
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
			
		}
		for (int x : set) {
			System.out.println(x);
		}
	}
	
	// remove the duplicate url from string 
	public static void removeDuplicateUrl(String s) {
		TreeSet<String> set = new TreeSet<String>();
		String[] ar = s.split(",");    // extra for above 

		for (int i = 0; i < ar.length; i++) {
		 String[]  t = 	ar[i].split("\\.");
		 System.out.println(t.length);
			set.add(t[1]);
		}

			for (String url : set) {

				System.out.println(url);
			}


	}
	
	

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		removeduplicate(ar);
		
//		String s = scan.nextLine();
//		
//		removeDuplicateUrl(s);
	
	}
	
	
	

}
