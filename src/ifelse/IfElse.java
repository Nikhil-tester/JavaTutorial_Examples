package ifelse;

public class IfElse {
/*
	Condition statement or ifelse = which evaluates the statement, that is true or falus
	if (boolean_expression)
	{
	 Execute if the boolean expression is true
	 }
*/

   /*
   comparator operators
   == is equal to
   != is not equal to
   > is greater than
   < is less than
   >= is greater than or equal to 
   <= is less than or equal to
   */
	
	public static void main(String[] args) {
		
		int x=10;
		
		// == Comparative operators which checks the condition
		if (x ==20) {
			System.out.println("yes x == 10");
		}
		else{
			System.out.println("STATEMENT 1 : no x is not equal to 10");	//!= not equals to operator
		}
		
		// != is not equal to
		if (x !=20) {
			System.out.println("STATEMENT 2 : yes x is not equal to 10");
		}
		else{
			System.out.println("no x != 10");	
		}
		
		//> is greater than
		if (x >20) {
			System.out.println("yes x is not equal to 10");
		}
		else{
			System.out.println("STATEMENT 3 : no is greater than 10");	
		}
		
		// < is less than
		if (x <20) {
			System.out.println("STATEMENT 4 : yes x is less than 10");
		}
		else{
			System.out.println("no is greater than 10");	
		}
		
		//>= is greater than or equal to 
		if (x >=20) {
			System.out.println("yes x is less than 10");
		}
		else{
			System.out.println("STATEMENT 5 : no x is greater than or equal to 10");	
		}
		
		// <= is less than or equal to
		if (x <=20) {
			System.out.println("STATEMENT 6 : yes x is less than or equal to 10");
		}
		else{
			System.out.println("no x is greater than or equal to 10");	
		}
		
		

	}

}
