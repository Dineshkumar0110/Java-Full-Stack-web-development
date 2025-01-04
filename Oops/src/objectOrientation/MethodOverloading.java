package objectOrientation;

public class MethodOverloading {

// In a class the method are same but the parameter are different.
//1. number of parameters
//2. data types of parameter
//3. order of parameter 

//  method overloading is a half of polymorphism is not real polymorphism.
//	different method doing different work so false ploymorphism

//	how many println method seen in your life
//	println(); accepts the int float double String char () empty

	public static int add(int a, int b) {  

		int sum = a + b;
		return sum;

	}

	public static int add(int a, int b, int c) {

		int sum = a + b + c;
		return sum;

	}

	public static float add(float a, float b) {

		float sum = a + b;
		return sum;

	}

	public static float add(int a, float b, int c) {

		float sum = a + b + c;
		return sum;

	}

	public static double add(double a, double b) {

		double sum = a + b;
		return sum;

	}

	public static double add(int a, float b, double c) {

		double sum = a + b + c;
		return sum;

	}

	public static float add(float a, int b, float c) {

		float sum = a + b + c;
		return sum;

	}

	public static double add(double a, int b, float c) {

		double sum = a + b + c;
		return sum;

	}
	


	public static void main(String[] args) {

		byte a = 127;
		byte b = 20;

		// creating object from class name MethodOverloading
		MethodOverloading calc = new MethodOverloading();

		// two method doing two different job but like same method doing different job
		System.out.println("=========method overloding==================");
		int res0 = calc.add(a, b);
		System.out.println(res0);

		int res1 = calc.add(2, 3);
		System.out.println(res1);

		int res2 = calc.add(3, 3, 3);
		System.out.println(res2);

		float res3 = calc.add(2.0f, 9.0f);
		System.out.println(res3);

		float res4 = calc.add(3, 3.0f, 3);
		System.out.println(res4);

		double res5 = calc.add(2.3, 2.0);
		System.out.println(res5);

		double res6 = calc.add(40, 3.3f, 3.00);
		System.out.println(res6);

		float res7 = calc.add(4, 2.3f, 4);
		System.out.println(res7);

		double res8 = calc.add(2.35, 10, 31.4f);
		System.out.println(res8);

		System.out.println("=========method overloding==================");
	}

}

