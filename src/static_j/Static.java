package static_j;

public class Static {

	/*
	 * static members belong to the class instead of a specific instead
	 * Creating instance of a class, also can be create many as we want
	 * Static member method will be shared by every instance
	 * Static member only belongs to class not to the instance
	 * Static method is access directly to the class, you are accessing by static method to the static method by using class name
	 * Non-static method can not be access directly to the class name eg. Hello.dosomethisels error
	 * Non-static method can be using by instance of class, (creating a object)
	 * we can declare a variable as static
	 * 
	 * When every crating a class using static access by direct by using class name
	 * When every creating a class without using static keyword access by using instance 
	 */
	
	public static void main(String[] args) {
		
		//Accessing static method from the main static method
		Hello.Dosomething("Accessing the static method from the main class");
		Hello.age=50;
		System.out.println("Accessing the static method from the main class : " +Hello.age);
		
		System.out.println();
	
		//Accessing non-static method from the main static method
		//creating an instance
		Hello instance = new Hello();
		
		instance.Dosomethingelse("Accessing the non-static method from the main class");
		instance.age = 10;
		System.out.println("Accessing the non-static method from the main class : " +instance.age);
		
	}

}
