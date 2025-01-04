package programming;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Day32 {
	
	
	
	public static void countPairs(int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				int c = map.get(ar[i]);
				map.put(ar[i], c + 1);
			} else {
				map.put(ar[i], 1);
			}
		}
		System.out.println(map);
		int sum = 0;
		Collection<Integer> values = map.values();
		for (int v : values) {
//				System.out.println(v);
//				System.out.println(v/2);
			sum = sum + v / 2;

		}
		System.out.println(sum);
	}
	
	
	public static void countWords(String s){
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] ar = s.split(" ");
		for (int i = 0; i < ar.length; i++) 
		{
			if (map.containsKey(ar[i])) {
				int c = map.getOrDefault(ar[i], 0);
				map.put(ar[i], c + 1);
			}
				else {
				map.put(ar[i], 1);
			}
		}
		 Set<String> keys  = map.keySet();
		 int max = 0;
		 String maxkey = null;
		 for (String key : keys) {
			  int value = map.get(key); 
			  if (value > max) {
				max = value;
				maxkey = key;
			}
		}
		 System.out.println(maxkey);
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();

		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Scan.nextInt();
		}

		countPairs(ar);
		String s = Scan.nextLine();
//		countWords(s);
		

	}

}
