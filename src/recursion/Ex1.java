package recursion;

//Java Recursion Example 1: Infinite times

public class Ex1 {

	static void recEx() {
		System.out.println("Recursion Example ....");
		
		recEx(); //<-Recursion
	}
	
	public static void main(String[] args) {
		recEx();
	}
}
