package parameterReturing;

public class Parameter_Returing {
	
	/*
	 * passing value to the methods and returning to it
	 */

	public static void main(String[] args) {
		
		sayHello("John");
		sayHello("Tom");
		sayHello("Nike");
		
		int sum =add(101, 232,11);
		int result=sum*22;
		System.out.println(result);
		
		
		//passing value can not be use until returning something
	}

	public static void sayHello(String name) //this is parameter passing as string
	{
		System.out.println("Hello " +name);
		
	}
	//Integer passing under method
	
	public static int add(int firstnumber, int secondnumber, int thirdnumber) {
		
		System.out.println("Addition Result : " + firstnumber + secondnumber +thirdnumber);
		return(firstnumber + secondnumber +thirdnumber); 
		
	}
	

}
