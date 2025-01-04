package objectOrientation;

class Charger {

	String brand;
	float voltage;

	public Charger(String brand, float voltage) {
		this.brand = brand;
		this.voltage = voltage;
	}

}

class Os {

	String name;
	float size;

	public Os(String name, float size) {
		this.name = name;
		this.size = size;
	}

}

class Mobile {

	Charger charger;
	Os os;

	public Mobile() {
		// to acheieve composistion inside the constructor create the object
		os = new Os("lollipop", 512.0f); // composition
	}

	public void setCharger(Charger charger) {
		// simple setter to acheive aggregation
		this.charger = charger;
	}

}

public class AggregationComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
		Charger MyCharger = new Charger("mi", 40);

		myMobile.setCharger(MyCharger);

		System.out.println(myMobile.os.name);
		System.out.println(myMobile.os.size);

		System.out.println(myMobile.charger.brand);
		System.out.println(myMobile.charger.voltage);

		myMobile = null; // mobile lost the os is lost/destory
		// this kind of relation ship is compostion

	}

}

//Aggregation is a loose bound has-a realationship
//composition is a tight bound has-a realationship
//simple setter to acheive aggregation
//to acheieve composistion inside the constructor create the object 

//Any object inside the heap with 0 reference consider as garbage

//
//student :  
//	    book , bike ----aggregration
//	    heart , brain --- composition


//the final keyword in java is used to restrict the user.
//variable : cannot changed the value constant
//method   :inherit cannot be modify or overridden
//class    : cannot be inherit

//final: It declares that final cannot be changeable
//finally : it execute the block of code whether the exception thrown or not
//finalize : grabage collection
