package objectOrientation;

import java.util.Scanner;

class Employee {

	private int id;
	private String name;
	private String email;
	private String dept;
	private float salary;

	public Employee() {
		
	}

	public Employee(int id, String name, String email, String dept, float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	
	
	

}

public class EmployeeEncapsulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Employee[] a = new Employee[n];

		for (int i = 0; i < a.length; i++) {
			String s = scan.next();
			String[] arr = s.split(",");
			
			
			
			int id = 1001 + i; // auto increment the id 
			String name = arr[0];
			String email = arr[1];
			String dept = arr[2];
			float Sal = Float.parseFloat(arr[3]);
			

			Employee e = new Employee(id, name, email, dept, Sal);
			a[i] = e;
		}

		for (int i = 0; i < a.length; i++) {
			Employee e = a[i];
			System.out.println("\nEmployee " + (i + 1) + "DETAIL");
			System.out.println("ID: " + e.getId() );
			System.out.println("Name: " + e.getName());
			System.out.println("Email: " + e.getEmail());
			System.out.println("Department: " + e.getDept());
			System.out.println("Salary: " + e.getSalary());

		}

	}
}

//developer should communicate each other by using uml diagram
//- is private + public
//howAreYou - camelCase varaiable& method & package	
//HowAreYou - pascal    class

//chatgpt prompt
//create a POJO class named as Employee
//
//after that taking the input  i need the output as mentioned
//2
//Alice,alice@example.com,HR,55000
//Bob,bob@example.com,Engineering,75000


