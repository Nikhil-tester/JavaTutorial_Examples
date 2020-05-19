package constructor;

public class Ex3 {

	int id;
	String name;
	
	//creating a parameterized constructor  
	Ex3(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
	
	Ex3 s1=new Ex3(11, "Amit"),
		s2=new Ex3(11, "Voda"),
		s3=new Ex3(13, "Mayank");
	
	s1.display();
	s2.display();
	s3.display();

	}

}
