package incrementOperatorandAssignmentOperator;

public class IncrementOperatorandAssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 * Two type of increment varibale 
		  1. Pre Increment
		  2. Post Increment 
		 */
		/*
		 *  = is the assigment operators
		 */
		
		
		int x =10;
		
		x= x+1; // increment x value by 1 =11
				//first way of incrementing the value
		System.out.println("Simple Add x+1 = " + x);
		
		
		x++;	//Post increment variable  =12
				//second way of incrementing the vale	
		System.out.println("Post Increment Operators x++ = " + x);
		
		/*
		  Post Increment = x++
		 */
		
		// Post increment but it wil not print =12
		System.out.println("Post Increment x++ = " + x++);
		
		//The value is change due to above action = 13
		System.out.println("Post Increment x++ and print x = " + x);
		
		/*
		 Pre Increment ++x = 14
		 */
		
		System.out.println("Pre Increment ++x = " + ++x);
		System.out.println("Pre Increment ++x and print value = " + x);
		
		/*
		  Operator
		 */
		
		// value of x is 14 here
		x += 5; // or it can x = x+5
		System.out.println("Adding value x += 5 = " + x);
		
		//multiple
		x *= 5; //or it can x = x*5
		System.out.println("multiple value x *= 5 = " + x);
		
		//divid
		 x /= 5; //or it can x = x/5
		 System.out.println("divid value x /= 5 = " +x);
		
		 x -= 5; // or it can x = x-5
		System.out.println("minus value x -= 5 = " +x);

	}

}
