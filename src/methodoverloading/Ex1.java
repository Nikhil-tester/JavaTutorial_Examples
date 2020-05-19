package methodoverloading;

/*
 * If a class has multiple methods having same name 
 * but different in parameters, it is known as Method Overloading.
 * 
 * There are two ways to overload the method in java
 * 1. By changing number of arguments
 * 2. By changing the data type
 */

//Method Overloading: changing no. of arguments

class Adder{
	static int add(int a, int b) {
		return(a+b);
	}
	
	static int add(int a, int b, int c) {
		return(a+b+c);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
	System.out.println(Adder.add(10,20));
	System.out.println(Adder.add(10, 20, 30));

	}

}
