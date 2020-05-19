package exception;
//multi-catch block.

public class Ex4 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
//			int a[]= {12,232,121};
//			System.out.println(a[10]);
		}
				catch (ArithmeticException e) {
					System.out.println("ArithmeticException");
				}
				catch (NullPointerException e) {
					System.out.println("NullPointerException");
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException");
				}
				catch (Exception e) {
					System.out.println("Exception");
				}
		System.out.println("excute rest code");
		
	}

}
