package callbyvalue_reference;

public class Ex2 {

	 int data=50;
	 void changeE(Ex2 Ex2) {
		Ex2.data=Ex2.data+100;
	}
	
	public static void main(String[] args) {
		Ex2 Ex2 = new Ex2();
		
		System.out.println("before change : "+Ex2.data);
		Ex2.changeE(Ex2);
		System.out.println("after change : "+Ex2.data);

	}

}
