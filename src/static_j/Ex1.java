package static_j;

class Example{
	int rollno;
	String name;
	static String collegeName="ITC";


Example(int i, String n){
	rollno=i;
	name=n;
}
void display() {
	System.out.println(rollno+" "+name+" "+collegeName);
}

}

public class Ex1 {

	public static void main(String[] args) {
		Example s1=new Example(10, "Amit"),
				s2=new Example(11, "voda");
		
		s1.display();
		Example.collegeName="DPS";
		s2.display();
		
		

	}

}
