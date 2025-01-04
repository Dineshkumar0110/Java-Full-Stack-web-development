 //package objectOrientation;
//
//class Plane {
//
//	void takeOff() {
//		System.out.println("plane is taking off");
//	}
//
//	void fly() {
//		System.out.println("plane is flying....");
//	}
//
//	void landing() {
//		System.out.println("plane is landing");
//	}
//}
//
//class CargoPlane extends Plane { // three method inherited
//
//	@Override
//	void fly() { // return type method name & parameter as it same
//		System.out.println("Cargoplane is flying at lower height");
//	}
//
//	void CarryCargo() {
//		System.out.println("CargoPlane is carring Cargo ......");
//	}
//
//}
//
//class PassengerPlane extends Plane { // three method inherited
//
//	@Override
//	void fly() { // return type method name & parameter as it same
//		System.out.println("PassengerPlane is flying at medium height");
//	}
//
//	void CarryPassenger() { // specialized method
//		System.out.println("PassengerPlane is carring Cargo ......");
//	}
//
//}
//
//class FighterPlane extends Plane { // three method inherited
//
//	@Override
//	void fly() { // return type method name & parameter as it same
//		System.out.println("FighterPlane is flying at greater height");
//	}
//
//	void CarryWeapon() { // specialized method
//		System.out.println("FighterPlane is carring Cargo ......");
//	}
//
//}
//
//public class MethodsOfInheritance {
//
//	public static void main(String[] args) {
//
//		CargoPlane cp = new CargoPlane();
//		cp.takeOff();
//		cp.fly();
//		cp.landing();
//		cp.CarryCargo();
//
//		PassengerPlane pp = new PassengerPlane();
//		pp.takeOff();
//		pp.fly();
//		pp.landing();
//		pp.CarryPassenger();
//
//		FighterPlane fp = new FighterPlane();
//		fp.takeOff();
//		fp.fly();
//		fp.landing();
//		fp.CarryWeapon();
//		
//		
//		
////		Plane ref = null;
////
////		Plane cp = new CargoPlane(); // loose coupling
////		Plane pp = new PassengerPlane();
////		Plane fp = new FighterPlane();
////		
////		ref= cp;
////		ref.fly();
////		
////		ref= pp;
////		ref.fly();
////		
////		ref= pp;
////		ref.fly();		
//		
//
//	}
//
//}
//
////
////types of methods 
////1 Inherited method
////2 overridden method
////3 specialized methods
//
////Annatations --- data about the methods @override
//
//
//
//
////  co variant
////explaination
////return type can change but it is co variant is a class has parent and child relationship
//
//
////object & reference are same type called as tight coupling
////object & reference are different type called as loosing coupling
////
////loosing coupling
////object is child type
////reference is parent type 
//
//
//// we can call overridden method & inherited method   
//// but not specialized methods because not visible to parent 
//
