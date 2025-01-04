package accessSpecifier;

public class Demo1 {
	public int a;
	protected int b;
	int c;
	private int d;
	
	
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

	
//	public    can access everywhere
//	protected can access inside the same class , sub class and package but not outside the package 
//	default   can access inside the same class , sub class but not outside the package 
//	private   can access only inside the class but not subclass ,package outside the package
	
	
}


