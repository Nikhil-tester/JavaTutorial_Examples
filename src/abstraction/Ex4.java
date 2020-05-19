package abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c() {
		System.out.println("i am c....");
	}
}

class C extends B{
	public void a() {
		System.out.println("i am a....");
	}
	public void b() {
		System.out.println("i am b....");
	}
	public void d() {
		System.out.println("i am d....");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		A obj=new C();
		
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
