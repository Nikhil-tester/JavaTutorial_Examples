package static_j;

class Example5{
	int rollno;
	String name;
	static String collegeName="TST";
	
	static void change() {
		collegeName="TCS";
	}
	
	Example5(int i, String n) {
		rollno=i;
		name=n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+collegeName);
	}
}

public class Ex4 {

	public static void main(String[] args) {
		
		Example5.change();
		
		Example5 s1=new Example5(10, "Amit"),
				 s2=new Example5(11, "Mayank"),
				 s3=new Example5(12, "voda");
		
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
