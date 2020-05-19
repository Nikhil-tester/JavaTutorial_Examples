package ifelse;

public class Tponit_Exm_IfStatement {

	/*
The Java if statement is used to test the condition. 
It checks boolean condition: true or false. There are various types of if statement in java.

if statement
if-else statement
if-else-if ladder
nested if statement
	 */
		
	public static void main(String[] args) {
	

		int age = 21;
		int marks =81;
		int weight = 50;
		
		//Java if Statement
		
		if(age>20) {
			System.out.println("Java if Statement : Allow to user to create account");
		}
		
		System.out.println("Java if Statement : Age is less then limit");
		
		
		//Java if-else Statement
		
		if(age>20) {
			System.out.println("Java if-else Statement : Allow user to create account");
		}
		else {
			System.out.println("Java if-else Statement : Age is less then limit");
		}
		
		//Java if-else-if ladder Statement
		
		if(marks < 50) {
			System.out.println("Java if-else-if ladder Statement : FAIL");
		}
		else if (marks>=50 && marks < 60) {
			System.out.println("Java if-else-if ladder Statement : D Grade");
		}
		else if (marks >=60 && marks <70) {
			System.out.println("Java if-else-if ladder Statement : C Grade");
		}
		else if (marks >=70 && marks <80) {
			System.out.println("Java if-else-if ladder Statement : B Grade");
		}
		else if (marks >=80 && marks <90) {
			System.out.println("Java if-else-if ladder Statement : A Grade");
		}
		else if (marks >=90 && marks <100) {
			System.out.println("Java if-else-if ladder Statement : A++ Grade");
		}
		else{  
	        System.out.println("Invalid!");  
	    }  
		
		//Java Nested if statement
				
		if(age>=21) {
			if(weight>=51) {
				System.out.println("Java Nested if statement : Allow to donet blood");
			}
			System.out.println("Java Nested if statement : Age limit is correct but weight is not correct");
		}
		
		
		
		
	}

}
