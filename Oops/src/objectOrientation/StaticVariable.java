package objectOrientation;



class Test{
	
	//static varaiable 
	 static int a,b;
	 // static block
	 static 
	 {
		 System.out.println("Inside static block ");
		 a=10;
		 b=20;
	 }
	 
	// static method
	 static void fun1() {
		 System.out.println("Inside static method");
	 }
	int x,y;
	
	
	{
		System.out.println("Inside Instance block");
			
	}
	 void fun2() {
		 System.out.println("Inside Instance method");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(y);
		 
	 }
	 
	 public Test() {
		 System.out.println("Inside constructor");
			x = 30;
			y = 40;
		
			
	 }
	
}



public class StaticVariable {

	public static void main(String[] args) {

		// static method so without object
		Test.fun1();
		//create a object then call method insatance method
	Test t = new Test();
	t.fun2();
		
		
		
	}

}


//jvm - java virtual machine
//ClassLoader -  serach the class
//static and non static
//object is instance  other teminalogy of instance object
//Static is class
//class Demo{
//	Static varaibles;
//	Static block;
//	Static methods;
//	instance variable;
//	instance block;
//	instance methods;
//	constructors
//	
//}

//class loading ,
//memory allocated for static variable
//execution  static block
//
//
//object creation
//memory allocated for instance variable
//execution  instance block
//exec constructor
