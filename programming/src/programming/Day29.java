package programming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Day29 {
//	1. program of sets
//	2. array can also store heterogenus data 
	
	
	
	public static void removeDuplicates(String s)
	{
//		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		TreeSet<Character> set= new TreeSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}
		String t = "";
		for (char c : set) {
			t = t + c;
			System.out.println(c);
		}
		System.out.println(t);
		System.out.println(t.length());
	}

	public static void main(String[] args) {
//
//		Scanner Scan = new Scanner(System.in);
//		int n  = Scan.nextInt();
//		
//		 int[] ar =  new int[n];
//		 for (int i = 0; i <ar.length ;i++) {
//			ar[i]= Scan.nextInt();
//		}
//		 
//		 for(int x: ar) {
//			 System.out.println(x);
//		 }
//		
		
//		Object[] ar = new Object[5];
//		ar[0] = 10;
//		ar[1] = 99.78;
//		
//		ar[2] = new String("TAP");
//		ar[3] = true;
//		ar[4] = 'C';
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		
//		Set
//		1. no duplicates 
//		2. searching is easy compare to  Array 
//		set  three classes
//		hashset
//		linked hashset
//		tree set 
		
//		hashset 
		
		
//		HashSet set = new HashSet(); heterogenous data
//		HashSet<Integer> set = new HashSet<Integer>(); // only homogenous
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); //insertion order maintained
//		TreeSet<Integer> set = new TreeSet<Integer>(); //insertion sorted , Asec order maintained
		
		
		
//		primitve  - wrapper
//		boxing    - unboxing
//		byte      - Byte
//		short     - Short
//		int 	  - Integer
//		long      - Long		
//		float	  - Float 
// 		double    - Double
//		char      - Character
//		boolean   - Boolean
		
//		int a = 10;   store 10 value
//	Integer a = 10;   10 consider as object
		
		
//		set.add(25);
//		set.add(25);   // duplicate no allowed
//		set.add(125);
//		set.add(150);
//		set.add(75);
//		set.add(100);
//		set.add(50);
//		set.add("BTM");
//		set.add(45.35);
//		set.add(null); 
//		set.add(false);
		
//		for (Integer x : set) {
//			System.out.println(x);
//		}
//		remove the duplicates
		// sitting on algorithm based on hashing algorthim
//		System.out.println(set);
		
//		1. insertion not maintained.
//		2. duplicates are not allowed 
//		3. Add heterogenous data
		
	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		removeDuplicates(s);
		
	
		
		
	}

}
