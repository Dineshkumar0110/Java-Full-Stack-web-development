package objectOrientation;


class Customer{
	
	
	//Declare varaiables 
	private String name;
	private long Cif;
	private float balance;
	
	
	// default or 0 constuctor
	public Customer(){
		name = "Arul";
		Cif = 1111;
		balance = 123456;
		
	}
	
	// this is setting all value in method in all constructor 
	//parametreized constuctor
//	public Customer(String name,long Cif,float balance){
//		this.name = name;
//		this.Cif = Cif;
//		this.balance = balance;
//	}
	
//	public Customer(String name,long Cif,float balance){
//		this();  
//		//goes to above customer constructor 
//		//calling another constuctor which accept the 0 parameterized constructor
//	}
	
	public Customer(String name,long Cif,float balance){
		this();     // constuctors always 1st line otherwise error
		this.name = name;
		this.Cif = Cif;
		this.balance = balance;
		
	}
	
	
	// Setters & getters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	private void setCif(long Cif) {
		this.Cif = Cif;
	}
	
	public long getCif() {
		return Cif;
	}
	
	public void setBalance(float balance) {
		if(balance > 0) {
		   this.balance = balance;
		}
	}
	
	public float getBalance() {
		return balance;
	}
	
	
}


public class EncapsulationLocalCh {

	public static void main(String[] args) {
		
		//creating object by using the new 
		Customer c1 = new Customer("Alex", 99991, 100000);
		// setting the data
//		c1.setName("Alex");
//		c1.setCif(9999991);
//		c1.setBalance(10000);
		
		
		System.out.println(c1.getName());
		System.out.println(c1.getCif());
		System.out.println(c1.getBalance());
		
//		
		
		
//		Customer c2 = new Customer("Alex", 99991, 100000);
//		printing or getting the data
//		System.out.println(c2.getName());
//		System.out.println(c2.getCif());
//		System.out.println(c2.getBalance());
		
		
		
		
	}

}

//explaination
//
//Encapsulation is providing security for most important thing in the code is data making instance varaiable as private 
//cannot acess the variable outside the class , can be access within the class
//direct access has been removed still you want to access in it you need indirect access or controlled class 
//by access using the setters and getters

//binding the data and methods together is called as Encapsulation

//instance name = name local; shadowing problem 
//shadowing problem is confusion b/w local and instance varaiable same name 
//use this keyword to resolve the problem current object address
//stack =  c1= 3000;
//heap = varaiable and default value 
//
//setters is called as mutators
//getters is called as access



// A constructor in Java is a special method that is used to initialize objects.
//The constructor is called when an object of a class is created.

// rules of  constructor

//creating constructor name same as class name 
//During object creation 

//default constructor 
//1. default constructor  		 --- created by jvm compiler
//2. 0 parameterized constructor --- created by programmer
//3. parameterized constructor
//create multiple constuctor is called constructor overloading
//its allowed to constructor same name same like as overlading

//By this acheiving constructor overloading and call another constructor



//Explaination of constructors
//constructor are same as class name
//it is complusaray
//the constuctor is invoke during object creation
//Assign the values for the instance varaiable
//there is constructor default constuctor createed by jvm
//multiple constuctor in class is called constuctor overloading
//1 constuctor to call another constuctor is called constuctor chaining is also local chaining