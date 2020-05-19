package thisKeyword;

class Exm3{
	void m() {
		System.out.println("hello m");
	}
	
	void n() {
		System.out.println("hello n");
		//same as this.m() or  //m();
		//m(); java will automatically take this class
		this.m();
		
	}
}

public class Ex3 {

	public static void main(String[] args) {
		Exm3 s1=new Exm3();
		s1.n();

	}

}
