package static_j;

public class Example1 {

	public static void main(String[] args) {
	    
		//NoofStudents static member shared by both the method
		
		//non-static mathod
		Ex1_Student mark = new Ex1_Student();
		System.out.println(Ex1_Student.getNoOfStudenta());
	
		Ex1_Student tom = new Ex1_Student();
		System.out.println(Ex1_Student.getNoOfStudenta());
		
		//static method
		//also called by class name. itself
		System.out.println(Ex1_Student.getNoOfStudenta());

	}

}
