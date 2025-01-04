package programming;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		
	

		// creating arraylist dynamic increase
		// it cannot grow or shrink  fixed size 
		// can store the heterogenous  data
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		System.out.println(list);
		list.add(2.0f);
		System.out.println(list);
		list.add(22.34567);
		System.out.println(list);
		list.add("JAVA");
		System.out.println(list);
		list.add("hello world");
//		arrayList.remove(0);
		System.out.println(list);
        list.remove(1);
        System.out.println(list);
		
	}
}