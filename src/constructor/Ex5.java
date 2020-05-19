package constructor;

//Java program to initialize the values from one object to another object.  
public class Ex5 {
	
	int id;
	String name;
	
	//constructor to initialize integer and string  
	Ex5(int i, String n){
		id=i;
		name=n;
	}
	
	//constructor to initialize another object 
	Ex5(Ex5 s){
		id=s.id;
		name=s.name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) {
	
	Ex5 s1=new Ex5(10, "Amit"),
		s2=new Ex5(s1);
	
	s1.display();
	s2.display();
	
	

	}

}
