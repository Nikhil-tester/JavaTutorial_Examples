package exception;
//nested try catch block

public class Ex5 {

	public static void main(String[] args) {
		
		try {
			try {
				int data = 30/0;
						System.out.println("into nested block...");
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
					a[5]=4;	
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		System.out.println("other statement..");
	}	
		catch (Exception e) {
				System.out.println("handeled..");
			}
			
		System.out.println("normal flow");
		}
		
	}
	


