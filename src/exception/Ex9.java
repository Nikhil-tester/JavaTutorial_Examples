package exception;
//throw keyword 

public class Ex9 {
	
	static void valiDate(int age) {
		if(age<18) {
			throw new ArithmeticException ("Welcome to vote");
		}
		else {
			System.out.println("not valid");
		}
		
	}

	public static void main(String[] args) {
		
		valiDate(19);
		System.out.println("rest code");

	}

}
