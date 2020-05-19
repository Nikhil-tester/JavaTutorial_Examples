package callbyvalue_reference;

public class Ex1 {

	static int data=50;
	
	static void change(int data) {
		data=data+100; //changes will be in the local variable only  
	}
	
	public static void main(String[] args) {
	
		System.out.println("before change : "+Ex1.data);
		change(500);
		System.out.println("after change : "+Ex1.data);
		
	}

}
