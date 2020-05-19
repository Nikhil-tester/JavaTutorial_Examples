package methodoverloading;

public class MethodOverloading {

	/*
	 * Multiple method with same name, but according to casting the data type java pick the method
	 * 
	 * Method overloading is same as method declaring, but the main thing is we can define different method with the same name 
	 *Two method we define with same name which can perform two different logic
	 *method = is a block of code
	 *Static method loaded with the class
	 */
	
	
	public static void main(String[] args) {
		
		//based on the logic we can use
		System.out.println("Casting int method : "+ method(1,2));
		System.out.println("Casting doulbe method : "+ method(1.3,2.5));
		System.out.println("Casting String method : "+ method("Hello", "You"));

	}
	//same method name but different logic
	public static int method(int a, int b) {
		return(a+b);
	}
	public static double method(double a, double b) {
		return(a+b);
	}
	public static String method(String a, String b) {
		return(a+b);
	}
	
	
	
	

}
