package practiesPackage;

public class P6 {

	void m() {
		System.out.println("hello m..!");
	}
	
	void n() {
		System.out.println("hello n..!");
		this.m();
	}
	
	void p() {
		System.out.println("hello p..!");
		this.n();
	}	
	
	public static void main(String[] args) {
	
	P6 obj=new P6();
	
	obj.p();
	}
}
