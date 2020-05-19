package final_j;
//Java final method-error

class Test{
	 final void run() {
		System.out.println("bike is running....");
	}
}

public class Ex2 extends Test {
	
//	void run() {
//		System.out.println("bike stop....");
//	}

	public static void main(String[] args) {
	
	new Ex1().run();

	}

}
