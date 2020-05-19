package exception;

import javax.imageio.IIOException;

//You handle the exception
//In case you handle the exception, the code will be executed fine whether exception occurs during the program or not.

class x{
	void y() throws IIOException{
		throw new IIOException("device error");
	}
}

public class Ex12 {

	public static void main(String[] args) {
		try
		{
			x obj = new x();
			obj.y();
		}
		catch (Exception e) 
		{
			System.out.println("exception handled");
		}
		System.out.println("rest code");

	}

}
