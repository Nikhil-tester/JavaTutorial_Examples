package classandobjects;

public class ClassessAndObjects {
	
	/*
	 * every java project has one class and one main method
	 * class is basically data structure or type inside which we some variables (members variables) and methods 
	 * most important properties are create instance or object from class
	 * also maintain instances from the main method
	 * 
	 * class can define different object , value object which are independent to each other
	 * class is a blue print, which contain state and behaviors
	 * object is a instance of class
	 */

	public static void main(String[] args) {
	
		//calling or creating instance on main method
		//mark ->object or instance
		
		Student mark  = new Student(); //creating instance of student class / creating object of student class 
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(21);
		
		//Tom ->object or instance

		Student Tom  = new Student(); //creating instance of student class / creating object of student class
		Tom.setId(2);
		Tom.setName("Tom");
		Tom.setAge(23);
		
		System.out.println("ID number "+ mark.getId()+" name is " +mark.getName() + " and " + mark.getAge() + " years old" );
		System.out.println("ID number "+ Tom.getId()+" name is " + Tom.getName() + " and " + Tom.getAge() + " years old" );
		
	}

}
