package exception;
//Propagation
/*
 * In the below example exception occurs in m() method where it is not handled,
 * so it is propagated to previous n() method where it is not handled, 
 * again it is propagated to p() method where exception is handled.
 */

public class Ex10 {
	
	void m() {
		int data=20/0;
		System.out.println(data);
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch (Exception e) {
			System.out.println("exception hendled");
		}
	}

	public static void main(String[] args) {
		
		Ex10 obj=new Ex10();
		obj.p();
		System.out.println("excute rest code");

	}

}
