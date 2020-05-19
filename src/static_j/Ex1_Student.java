package static_j;

public class Ex1_Student {

	String Name;
	int age;
	
	//below static member shared both the instance 'NoofStudents'
	static int NoofStudents=0;
	
	//creating a constructor
	Ex1_Student(){
		NoofStudents++;
	}
	
	public static int getNoOfStudenta() {
		return NoofStudents;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
