package recursion;
//Java Recursion Example 2: Finite times

public class Ex2 {

	static int count =0;
	
	 static void finite() {
		count++;
		if(count<=5) {
			System.out.println("recursion count is : "+count);
			finite();
		}
	}
	
	public static void main(String[] args) {
		
			
		finite();

	}

}
