package classandobjects;

public class Ex_1 {
	
	//field or data member or instance variable 
	//Example of accessing member through reference variable
	
	int id;
	String name;
	
	
	public static void main(String arg[]) {
		//creating an object of Student 
		Ex_1 s1= new Ex_1();
		
		
		//By reference variable
		s1.id=10;
		s1.name="amit";
		
		//accessing member through reference variable
		System.out.println(s1.id+" "+s1.name);
		
		Ex_1 s2=new Ex_1();
		
		s2.id=11;
		s2.name="Mayak";
		
		System.out.println(s2.id+" "+s2.name);
			
		
	}
	

}
