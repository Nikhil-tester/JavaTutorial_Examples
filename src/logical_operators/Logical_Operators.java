package logical_operators;

public class Logical_Operators {

	/*
	   Use Logical Operators we check multiple conditions
	   useing && , || (OR /duble pipe operator)
	   && all added statement should be ture
	   || any of condition should be true
	   
	 */
	
	public static void main(String[] args) {
	
		int subject1 =20;
		int subject2 =60;
		
		// &&->And operator   ||-> OR operator
		//here checking for AND condition using && operator
		if((subject1 == 20) && (subject2 != 35)) {
			System.out.println("All given condition is ture using && operator");
		}
		else
		{
			System.out.println("the condition is false");
		}
		
		// here checking for OR condition using || operator
		if((subject1 == 35) || (subject2 == 35)) {
			System.out.println("the condition is ture");
		}
		else
		{
			System.out.println("Ether of one condition is ture using || operator");
		}

	}

}
