package exception;

import javax.imageio.IIOException;

public class Ex11 {

	void x() throws IIOException {
		throw new IIOException("exception");
	}
	void y() throws IIOException {
		x();
	}
	void z() {
		try {
			y();
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[] args) {
		
		Ex11 obj = new Ex11();
		obj.z();
		System.out.println("rest code");
		

	}

}
