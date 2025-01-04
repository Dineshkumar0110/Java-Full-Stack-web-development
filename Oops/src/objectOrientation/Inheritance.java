package objectOrientation;



class Demo1 {  // parent class || super || base

//	private int x;    rule1
	int x;
	int y;

	void fun1() {
		System.out.println("fun1");
	}

}

class Demo2 extends Demo1{    // child class || child || Derived

//	inherited all data from the above class to here
	void fun2() {
		System.out.println("fun2");
	}
}

class Demo3 extends Demo2{
	void fun3() {
		System.out.println("fun3");
	}
}


public class Inheritance {
	
	public static void main(String[] args) {
//		Demo1 d1 =new Demo1();
//		System.out.println(d1.x);
//		d1.fun1();
		
//		Demo2 d2 =new Demo2();
//		System.out.println(d2.x);
//		System.out.println(d2.y);
//		d2.fun1();
		
		Demo3 d3 =new Demo3();
		d3.fun1();
		d3.fun2();
		d3.fun3();
		
	}

}



//Inheritance:
//	Inheritance is the process of one class acquring to the 
//	properties and the behaviour of another class
//Advantages:
//	code reusability
//	reduces development effort and time 
//	increase profitability
//Extends  keyword to acheive the inheritance


//rule1
//private number do not particapate inheritance variable and method
//rule 2 
//multilevel inheritance is permitted in java
//rule3 
//Multiple inheritance is not permitted in java as it leads 
//to diamond shaped problem which results in ambigous
//rule4
//cyclic inheritance is not permitted
//rule5

//constructor are inheritance from parent and child 
//No constructor are not inherited from parent and child

//diagram
//-------------------------
// c demo1      <-----  c demo2
//-------------------------
//X: int         
//y:int 
//------------
//fun1(): void