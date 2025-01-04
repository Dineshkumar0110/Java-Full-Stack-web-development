package objectOrientation;

import java.util.Scanner;

class BussinessMan{
	
	private float p;
	private float t;
	private static float r;
	private float si;
	
	static 
	{
		r = 8.5f;
	}
	
	public void acceptInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount");
		p = scan.nextFloat();
		System.out.println("Enter Tenure");
		t = scan.nextFloat();
		
			
	}
	
	public void calculateIntrest(){
		si = (p*t*r)/100;
	}
	
	
	public void dispIntrest(){
		System.out.println("SI = " + si);
	}
	
}


public class StaticCoding {
	
	public static void main(String[] args) {
		
		BussinessMan b1 = new BussinessMan();
		b1.acceptInput();
		b1.calculateIntrest();
		b1.dispIntrest();
		
		BussinessMan b2 = new BussinessMan();
		b2.acceptInput();
		b2.calculateIntrest();
		b2.dispIntrest();
	}

}

//class variables are static variables
//static variable adhar card country nationality
//static can work without object