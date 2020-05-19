package methods;

public class Methods {
		
		/*
		 * Methods is a pieces of code which executes some logic
		 * we can rap this method with a name
		 * we can call this method using raped name again and again when needed
		 * We can call method under main method again and again without re-writing again
		 * main method can contain many child methods
		 * When we need method: when every we use same methods or reducing the efforts or line 
		 */

	public static void main(String[] args) {
		
		myFirstMethod(); //running this again and again
		myFirstMethod();
		myFirstMethod();
		myFirstMethod();
		
		mySecondMethod();
	}
		public static void myFirstMethod() {
			System.out.println("Executing First Method");
		}	
		
		public static void mySecondMethod() {
			System.out.println("Executing Second Method");
		}


}



