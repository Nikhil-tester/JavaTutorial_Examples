package constructor;

//Copying values without constructor

public class Ex6 {

	int id;
	String name;
	
	Ex6(int i, String n){
		id=i;
		name=n;
	}
	
	Ex6(){
		
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
	
	Ex6 s1=new Ex6(11, "Amit"),
		s2=new Ex6();
	
	//Copying values without constructor
	s2.id=s1.id;
	s2.name=s1.name;
	
	s1.display();
	s2.display();

	}
}
