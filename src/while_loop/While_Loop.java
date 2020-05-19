package while_loop;

public class While_Loop {

	/*
	 Loop = Block or piece of code want to execute again and again, until desirer condition is archive
	 or
	 Running a block of statement again and again, until the while condition is archiv. while()<-under this brakets
	 */
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 10;
		
		//the given condition a is greater than 10, controaler will excute the code again and again until the point archive
		//increment order
	
		while(a <= 10) 
		{
			System.out.println(a);
			a++;
		}
		System.out.println("loop is tarmenated for increment order, point has been archive");
		
		//decrement order
		while(b >= 0) 
		{
			System.out.println(b);
			b--;
		}
		System.out.println("loop is tarmenated for decrement order, point has been archive");
	}
}
