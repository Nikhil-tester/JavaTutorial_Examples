package exception;
//finally block - case 2 [exception occurs and not handled.]

public class Ex7 {

	public static void main(String[] args) {
	
	try {
		int data=25/0;
		System.out.println(data);
	}
	catch (NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("excuting finally block");
	}
	System.out.println("rest code");

	}

}
