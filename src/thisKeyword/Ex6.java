package thisKeyword;

class Exm6{
	int rollno;
	String name,course;
	float fee;
	
	Exm6(int rollno, String name, String course){
			this.rollno=rollno;
			this.course=course;
			this.name=name;
	}
	
	Exm6(int rollno, String name, String course, float fee){
		
		//reusing constructor  
		//C.T.Error must be this mannar only
		this(rollno, course,name);
		this.fee=fee;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}

public class Ex6 {

	public static void main(String[] args) {
		
		Exm6 s1 = new Exm6(101, "Amit", "Java"),
			 s2= new Exm6(102, "Jay", "JAVA", 10000);
		
		s1.display();
		s2.display();
	}

}
