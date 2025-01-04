package designPatterns;

//class Dog {
//	
//	static Dog d = new Dog();
//	private Dog() {
//
//	}
//
//	static  Dog getInstance() {
//
//		if (d == null) {
//			d = new Dog();
//		}
//		return d;
//	}
//}


interface Animal{
	
}
class AnimalFactory
{
	static Animal createInstance(String name){
		if (name.equalsIgnoreCase("Dog")) {
			return new Dog();
		}
		else if (name.equalsIgnoreCase("Cat")) {
			return new cat();
		}
		else if (name.equalsIgnoreCase("Rat")) {
			return new rat();
		}
		return null;
	}
}
class Dog implements Animal{
	
}
class cat implements Animal{
	
}
class rat implements Animal{
	
}


public class SingleTonDesignPattern {

	public static void main(String[] args) {

//		disable to create the object
//		Dog d = new Dog();
//		System.out.println(d);
//		Dog d1 = new Dog();
//		System.out.println(d1);
		
//		Dog d1 = Dog.getInstance();
//		System.out.println(d1);
//		
//		Dog d2 = Dog.getInstance();
//		System.out.println(d2);
		Animal dog = AnimalFactory.createInstance("Dog");
		Animal cat = AnimalFactory.createInstance("Cat");
		Animal rat = AnimalFactory.createInstance("Rat");
		System.out.println(dog);
	}

}

//explaination:
//	Design pattern : proven solution for existing problem that is called design pattern
//avoid to create multiple object
//constructor only create the object
//object i also know as instance
//interpreter line by line execute
//this solution is created by someone and used by us is called design pattern


//singleton 
//
//1.early - early loaded
//2.lazy

//Factory Design pattern
//To acheive with the help of loose coupling by using polymorphosm 
//parent refernce child object

//DAO - data access  object  -- jdbc
//DTO - Data transfer object
//MVC - model view controller -- servelts , jsp, model  ---- jee

