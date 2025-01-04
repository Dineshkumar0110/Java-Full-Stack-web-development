package objectOrientation;

import java.util.Scanner;

class Plane {

	public void fly() {
		System.out.println("plane is flying....");
	}

	public void takeOff() {
		System.out.println("plane is taking off");
	}

	public void landing() {
		System.out.println("plane is landing");
	}
}

class CargoPlane extends Plane { // three method inherited

	@Override
	public void takeOff() {
		System.out.println("CargoPlane is taking off");
	}

	@Override
	public void fly() { // return type method name & parameter as it same
		System.out.println("Cargoplane is flying at lower height");
	}

	@Override
	public void landing() {
		System.out.println("CargoPlane is landing");
	}

}

class PassengerPlane extends Plane { // three method inherited

	@Override
	public void takeOff() {
		System.out.println("PassengerPlane is taking off");
	}

	@Override
	public void fly() { // return type method name & parameter as it same
		System.out.println("PassengerPlane is flying at lower height");
	}

	@Override
	public void landing() {
		System.out.println("PassengerPlane is landing");
	}

}

class FighterPlane extends Plane { // three method inherited

	@Override
	public void takeOff() {
		System.out.println("FighterPlane is taking off");
	}

	@Override
	public void fly() { // return type method name & parameter as it same
		System.out.println("FighterPlane is flying at lower height");
	}

	@Override
	public void landing() {
		System.out.println("FighterPlane is landing");
	}

}

class Factory {
	public static Plane getPlane(String choice) {
		if (choice.equalsIgnoreCase("CargoPlane")) {

			return new CargoPlane();
		} else if (choice.equalsIgnoreCase("PassengerPlane")) {

			return new PassengerPlane();
		} else if (choice.equalsIgnoreCase("FighterPlane")) {

			return new FighterPlane();
		} else {
			return null;
		}
	}
}

public class PolyMorphism {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice :\nCargoPlane \nPassengerPlane \nFighterPlane\n");
		String choice = scan.next();

//		Factory f= new Factory();
		Plane p = Factory.getPlane(choice); // static method calling
		p.takeOff();
		p.fly();
		p.landing();
		
		
//		Explaination
		//same line of code execute by different output
//		because method overriding , inheritance , loosing coupling 
//		one object different kinds of behaviour is called polymorphism
//		this is actually true polymorphism 
		
//		the decision is called taking during runtime polymorphism dynamic binding
//		the decision is called taking during compile time  polymorphism method overloading static binding
		
		
//		polymorphism -- to acheive method overriding , inheritance , loosing coupling 
//		one object showing the different kind of behaviour at different instance that is called polymorphism
		
		
	}

}

//explaination

//  co variant
////explaination
////return type can change but it is co variant is a class has parent and child relationship
//
//
////object & reference are same type called as tight coupling
////object & refernce are differnt type called as loosing coupling
////
////loosing coupling
////object is child type
////reference is parent type 
//
//
//// we can call overridden method & inherited method   
//// but not specialized methods because not visible to parent 
//
