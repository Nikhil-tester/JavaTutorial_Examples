package exception;
//finally block - case 3 [exception occurs and handled.]


public class Ex8 {

	public static void main(String[] args) {
	
	try {
		int data = 35/0;
		System.out.println(data);
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("excuting finally block");
	}
	System.out.println("rest code");
	
	}

}
	