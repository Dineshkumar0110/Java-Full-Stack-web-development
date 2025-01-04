package objectOrientation;

import java.util.Scanner;

//
//abstract class Plane {
//
//	abstract void fly();
//
//	abstract void takeOff();
//
//	abstract void landing(); 
//}
//
//class CargoPlane extends Plane { // three method inherited
//
//	@Override
//	public void takeOff() {
//		System.out.println("CargoPlane is taking off");
//	}
//
//	@Override
//	public void fly() { // return type method name & parameter as it same
//		System.out.println("Cargoplane is flying at lower height");
//	}
//
//	@Override
//	public void landing() {
//		System.out.println("CargoPlane is landing");
//	}
//
//}
//
//class PassengerPlane extends Plane { // three method inherited
//
//	@Override
//	public void takeOff() {
//		System.out.println("PassengerPlane is taking off");
//	}
//
//	@Override
//	public void fly() { // return type method name & parameter as it same
//		System.out.println("PassengerPlane is flying at lower height");
//	}
//
//	@Override
//	public void landing() {
//		System.out.println("PassengerPlane is landing");
//	}
//
//}
//
//class FighterPlane extends Plane { // three method inherited
//
//	@Override
//	public void takeOff() {
//		System.out.println("FighterPlane is taking off");
//	}
//
//	@Override
//	public void fly() { // return type method name & parameter as it same
//		System.out.println("FighterPlane is flying at lower height");
//	}
//
//	@Override
//	public void landing() {
//		System.out.println("FighterPlane is landing");
//	}
//
//}
//
//public class Abstraction {
//
//	public static void main(String[] args) {
//		
//		Plane fp = new CargoPlane();
//		fp.takeOff();
//		fp.fly();
//		fp.landing();
//
//	}
//
//}
//abstract class Shape{
//	protected float area;
//	abstract void acceptInput();
//	abstract void calcArea();
//	public void dispArea() {
//		System.out.println("Area = "+ area);
//	}
//	
//}
//
//class Square extends Shape{
//	private float side;
//	
//	@Override
//	public void acceptInput() {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the side:");
//		side = scan.nextFloat();
//	}
//	
//	@Override
//	public void calcArea() {
//		area = side*side; 
//	}
//	
//}
//
//class Rectangle extends Shape{
//	private float length;
//	private float breadth;
//	
//	@Override
//	public void acceptInput() {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the length:");
//		length = scan.nextFloat();
//		System.out.println("Enter the breadth:");
//		breadth = scan.nextFloat();
//		System.out.println("Enter the area:");
//		area = scan.nextFloat();
//	}
//	@Override
//	public void calcArea() {
//		area = length*breadth; 
//	}
//	
//}
//
//class Circle extends Shape{
//	private float radius;
//	
//	@Override
//	public void acceptInput() {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the radius:");
//		radius = scan.nextFloat();	
//	}
//	@Override
//	public void calcArea() {
//		area = 3.142f* radius * radius; 
//	}
//	
//}

abstract class Bird{
	
	abstract public void eat();
	abstract public void fly();
}

abstract class Eagle extends Bird{
	@Override
	public void fly() {
		System.out.println("Eagle is flying "); // cannot create object 
	}
}

class SerpentEagle extends Eagle{
	@Override
	public void eat() {
		System.out.println("SerpentEagle is eating serpent ");
	}
}

class GoldenEagle extends Eagle{
	@Override
	public void eat() {
		System.out.println("GoldenEagle is eating ");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
//		Shape shape = new Square();
//		shape.acceptInput();
//		shape.calcArea();
//		shape.dispArea();
//		Eagle e = new SerpentEagle();
		Bird e = new GoldenEagle();
		e.fly();
		e.eat();
		
		
	  }
	}

//Hiding unwanted/implementation data is abstraction.Exposing only the necessary information for the user 

//Abstract Method: A method with only signature doesnot body is called abstract method

//Abstract class: An abstract class inside with a class whole object is cannot used.


//Rules of abstraction

