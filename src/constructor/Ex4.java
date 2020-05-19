package constructor;

public class Ex4 {

	int id;
	int age;
	String name;
	
	Ex4(int i, String n){
		id=i;
		name=n;
	}
	
	Ex4(int i, int a, String n){
		id=i;
		age=a;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+age+" "+name);
	}
	public static void main(String[] args) {
	
	Ex4 s1=new Ex4(11, "voda"),
		s2=new Ex4(12, 27, "Mayank");
	
	s1.display();
	s2.display();

	}

}
