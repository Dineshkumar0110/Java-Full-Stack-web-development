package programming;

import java.util.Scanner;

//Array pairs 
public class Day11 {

	//second largest array example: experience ceo cofounder 
	public static int secondLargest(int[] ar)
	{
		int p = ar[0], vp = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > p) {
				vp = p;
				p = ar[i];
			} else if (ar[i] > vp && ar[i] != p) { // &because 5 5 second largest
				vp = ar[i];
			}
		}
		return vp;

	}	
	
	// array pairs largest
	public static int ArrayPairs(int[] ar)
	{
		int Largest = ar[0], SecondLargest = Integer.MAX_VALUE;		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]> Largest) {
				SecondLargest = Largest;
				Largest =ar[i];
			} else if(ar[i] > SecondLargest){ 
				SecondLargest = ar[i];
			}
		}
		return Largest+SecondLargest;
		
	}
	
	
	
	//smallestPairs
	public static int smallestPairs(int[] ar)
	{
		int smallest = ar[0], Secondsmallest = Integer.MAX_VALUE;		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]< smallest) {
				Secondsmallest = smallest;
				smallest =ar[i];
			} else if(ar[i] < Secondsmallest){ 
				Secondsmallest = ar[i];
			}
		}
		return smallest+Secondsmallest;
		
	}
	
	
	// productPairs
	public static int productPairs(int[] ar)
	{
		int Largest = ar[0], SecondLargest = Integer.MAX_VALUE;		
		int smallest = ar[0], Secondsmallest = Integer.MAX_VALUE;		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]> Largest) {
				SecondLargest = Largest;
				Largest =ar[i];
			} else if(ar[i] > SecondLargest){ 
				SecondLargest = ar[i];
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]< smallest) {
				Secondsmallest = smallest;
				smallest =ar[i];
			} else if(ar[i] < Secondsmallest){ 
				Secondsmallest = ar[i];
			}
		}
		
	int	p1 = Largest * SecondLargest;
    int p2 = smallest* Secondsmallest;
    
    
    return p1>p2 ? p1 :p2; 
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
	
		int res = secondLargest(ar);
		System.out.println(res);
		
//		int res= ArrayPairs(ar);
//		System.out.println(res);
		
//		int res= smallestPairs(ar);
//		System.out.println(res);
		
//		int res= productPairs(ar);
//		System.out.println(res);
		
	
	}

}
