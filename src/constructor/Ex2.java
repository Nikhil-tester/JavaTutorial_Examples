package constructor;

public class Ex2 {
//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type
	
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Ex2 s1=new Ex2(),s2=new Ex2();
		s1.display();
		s2.display();

	}

}
