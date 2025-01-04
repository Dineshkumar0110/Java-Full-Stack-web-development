package programming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Day31 {
	
	
	
	// maps Intro 
//	map is a collection of <key, value> pair follow hashing algorthims 
//	whole map is collection of entry
//	key part  not dupliacte  values dupliacte are allowed
//	table 
//	key    value
//	keyset values
//	india 900
//	china 5000
//	usa   8909
//	uae   200    key value pair Entry 
//	whole table is entry set
//	methods 
//	put(object key , object value) v i
//	map.putAll(map m)
//	remove(object key) v i
//	clear()
//	map.size()
//	get(object key) v i
//	containsKey(object key)  return boolean value 
//	containsValue(object value)  
//	keyset()
//	values()
//	entryset()
//	isEmpty()
//	getKey()
//	getValue()
	
	public static void countCharacter(String s) {
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		
//		loop starts 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, c + 1);
			} else {
				map.put(ch, 1);
			}
		}
		String t = "";
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			int value = map.get(key);
//			System.out.println(key + " : " + value );
			t = t + key + value;
		}
		System.out.println(t);
	}
	
	public static void main(String[] args) {

//		map can store the heterogenous data and homogenous data 
//		HashMap map = new HashMap();
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); // maintained insertion order
//		TreeMap<String, Integer> map = new TreeMap<String, Integer>(); 
		// sorted order
		
		
//		map.put("india",1000);
//		map.put("india",2000);   // take last one 
//		map.put("china ",1900);
//		map.put("japan ",1900);
//		map.put("usa ",700);
//		map.put("uae",500);
//		map.put(500, "pakistan");
//		map.put(null, "pakistan");
//		map.put(true, false);
//		map.put(65.95, 'A');
//		map.put(new NullPointerException(), 45);
//		System.out.println(map);
//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//			int value = map.get(key);
//			System.out.println(key + " : " + value);
			// prints only keys and step by step

		
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			countCharacter(s);
	
		
		}
		
	}

