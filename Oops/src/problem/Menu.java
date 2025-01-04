package problem;


import java.util.Scanner;

class MenuItem {

	protected int itemID;
	protected String itemName;
	protected float price;
	protected String category;

	public MenuItem() {

	}

	public MenuItem(int itemID, String itemName, float price, String category) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return itemID+","+itemName+ "," + price+","+category;
	}

	public void display() {
		System.out.println("itemID : " + itemID);
		System.out.println("itemName: " + itemName);
		System.out.println("price: " + price);
		System.out.println("category: " + category);

	}

}

class Beverage extends MenuItem {

	protected float caffeineContent;

	public Beverage() {

	}

	public Beverage(int itemID, String itemName, float price, String category, float caffeineContent) {
		super(itemID, itemName, price, category);
		this.caffeineContent = caffeineContent;
	}

	public float getCaffeineContent() {
		return caffeineContent;
	}

	public void setCaffeineContent(float caffeineContent) {
		this.caffeineContent = caffeineContent;
	}

	@Override
	public void display() {
//		System.out.println("itemID : " + itemID);
//		System.out.println("itemName: " + itemName);
//		System.out.println("price: " + price);
//		System.out.println("category: " + category);
		super.display();
		System.out.println("caffeineContent :" + caffeineContent);

	}

}

class MainCourse extends MenuItem {

	protected float calories;
	protected String cuisineType;

	public MainCourse() {

	}

	public MainCourse(int itemID, String itemName, float price, String category, float calories, String cuisineType) {
		super(itemID, itemName, price, category);
		this.calories = calories;
		this.cuisineType = cuisineType;
	}

	public float getCalories() {
		return calories;
	}

	public void setCalories(float calories) {
		this.calories = calories;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("calories: " + calories);
		System.out.println("cuisineType: " + cuisineType);
	}

}

public class Menu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the choice\r\n" + "Beverage\r\n" + "MainCourse");

		String choice = scan.next();

		MenuItem item = Factory.getMenuItem(choice);
		System.out.println(item);
//		item.display();
		
		//String object
		String s = new String("Tap");
		System.out.println(s);
		
		
		//menu object
//		 MenuItem item = new MenuItem(1, "dosa" , 70, "breakfast");
//		 System.out.println(item);
		 // fully qualified @hashcode because object of class
		 
//		 clone
//		 hashcode
//		 equals
//		 tostring
//		 wait
//		 notify
//		 notifyAll
//		 finalise
		
		
		
		
	}
		
		

}

/// factory design pattern 
class Factory {

	static Scanner scan = new Scanner(System.in);

	static MenuItem getMenuItem(String choice) {
		System.out.println("Enter the MenuItem");
//		pepsi,70,cooldrinks,37.5
		String s = scan.next();

		// split the string
		String[] ar = s.split(",");

		int id = 101;
		String itemName = ar[0];
		float price = Float.parseFloat(ar[1]);
		String category = ar[2];
		
		if (choice.equalsIgnoreCase("Beverage")) {
		
			float caffeineContent = Float.parseFloat(ar[3]);

			Beverage b = new Beverage(id, itemName, price, category, caffeineContent);
			return b;

		} else if (choice.equalsIgnoreCase("MainCourse")) {

			
			float calories = Float.parseFloat(ar[3]);
			String cuisineType = ar[4];

			MainCourse c = new MainCourse(id, itemName, price, category, calories, cuisineType);
			return c;

		} else {
			return null;
		}
	}

}
