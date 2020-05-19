package exception;
//finally block

public class Ex6 {

	public static void main(String[] args) {
	
	try {
		int data = 35/5;
		System.out.println(data);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally block excuted...");
	}
	
	System.out.println("exuted rest code...");

	}

}
