package user_input;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in); //Using scanner data type we can take input from user
											  // system.in use to data from user
											 // can be declare on private for the class. 
											 //no need to declare again and again for the class
											//nextInt = use to take the value according to data type. 
											//post dot there are double stringNext,many thinsg
											//scanning int value 
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter some number :");
		int user_input_number = scan1.nextInt(); //expecting int value
		System.out.println("User Entered value is :");
		System.out.println(user_input_number);
		
		//scanning double value 
		
		Scanner scan2= new Scanner(System.in);
		System.out.println("Enter some double : ");
		double user_input_double = scan2.nextDouble(); //expecting double value
		System.out.println("User Entered value is :");
		System.out.println(user_input_double);
		
		//scanning text value 
		
		Scanner scan3= new Scanner(System.in);
		System.out.println("Enter some Text : ");
		String user_input_text = scan3.nextLine(); //expecting text/string value
		System.out.println("User Entered value is :");
		System.out.println(user_input_text);
		
		

	}

}
