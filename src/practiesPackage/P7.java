package practiesPackage;


class A{
	 A(){
		System.out.println("hello x..!");
	}
	 A(int x) {
		this();
		System.out.println("hello Ax");
	}

}
public class P7 {
	public static void main(String[] args) {
	A obj = new A(10);
	}
}
