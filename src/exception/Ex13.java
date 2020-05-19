package exception;

import java.io.IOException;

//You declare the exception
/*
A)In case you declare the exception, if exception does not occur, the code will be executed fine.
B)In case you declare the exception if exception occures, an exception will 
be thrown at runtime because throws does not handle the exception.
 
 A)Program if exception does not occur
 */

class Test13{
	void method() throws IOException{
		System.out.println("device connected");
	}
	
}

public class Ex13 {

	public static void main(String[] args) {
		
		try 
		{
			Test13 obj= new Test13();
			obj.method();
		}
		catch (Exception e) 
		{
			System.out.println("exception handled");
		}
		System.out.println("rest code");

	}

}
