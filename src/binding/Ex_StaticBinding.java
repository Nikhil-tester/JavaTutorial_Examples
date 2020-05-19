package binding;
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.

public class Ex_StaticBinding {

	private void eat() {
		System.out.println("dog is eating....");	
	}
	public static void main(String[] args) {
		
		new Ex_StaticBinding().eat();

	}

}
