package methodoverloading;

public class example1 {
	
	/*
	 *Static method loaded with the class
	 */

	public static void main(String[] args) {
		
		//without static method
		example1 test = new example1();
		test.test();
		
		//with static method
		example1.dotest();
		
		// over loading
		example1 test1 = new example1();
		System.out.println(test1.Tenyear(10));
		
		// over loading
		example1 test2 = new example1();
		System.out.println(test2.Tenyear(10,"Nikhil"));
		
		// over loading
		example1 test3 = new example1();
		System.out.println(test3.Tenyear(10,2019));

	}
	
	//this is not a static class we need to create a object on main method
	public void test() {
		System.out.println("hello from test");
	}
	
	//static method not need to create object
	public static void dotest() {
		System.out.println("Hello from the static test");
	}
	
	public int Tenyear(int Age) {
		return  Age + 10;
	}
	
	public int Tenyear(int Age, String Name) {
		System.out.println(Name);
		return  Age + 10;
	}
	
	public int Tenyear(int Age, int year) {
		return  Age + year;
	}
}
