package objectOrientation;

class Test1 {

	int x, y;

	public Test1() {
		x = 100;
		y = 200;
		System.out.println("Test1");
	}

	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Test1.1");
	}
}

class Test2 extends Test1 {
	int a, b;
	int x;

	public Test2() {
//		super();default
//		this(9,99); // call the constructor same class local chaining
		a = 300;
		b = 400;
		System.out.println("Test2.1");
	}

	public Test2(int a, int b) {
//		super(); default  compliler write with 0 parameter
//		super(a,b);
		this.a = a;
		this.b = b;
		System.out.println("Test2.2");
	}

	void disp() {
		int x = 999;
		System.out.println("child"+this.x);
		System.out.println("parent"+super.x);
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
//		Test2 t2 = new Test2(9,99);
		t2.disp();

	}

}




//Explaination
//In Java, constructor of base class with no argument gets automatically called in 
//derived class constructor by a process called as constructor chaining.

//Constructor chaining is a process of child class constructor calling its parent 
//class constructor using super() call.
//
//The first line is automatically super() call.
//Irrespective of whether it is parameterized constructor or zero 
//parameterized constructor of child class, the super() call will automatically 
//take the control to zero parameterized constructor of parent class.