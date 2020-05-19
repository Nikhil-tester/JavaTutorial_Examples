package practice;

import java.util.Scanner;

public class Trail1_Calculator {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter First number :");
		int x = scan.nextInt();
		
		System.out.println("Enter Second number :");
		int y = scan.nextInt();
		
		System.out.println("Enter Thrid number :");
		int z = scan.nextInt();
		
		//addition of three number
		int answer = x+y+z;
		
		System.out.println("Answer is : " + answer );
		

	}

}
