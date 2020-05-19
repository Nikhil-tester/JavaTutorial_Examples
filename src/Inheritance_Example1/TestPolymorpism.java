package Inheritance_Example1;

public class TestPolymorpism {

	public static void main(String[] args) {
		
		//multiple object creating
		Person persons[] = new Person[3];
		
		persons [0] = new Student("Sam", "Watlton", 2019, 2.4);
		persons [1] = new Student("Bill", "Gates", 2020 , 3.2);
		persons [2] = new Professor("Nikhil", "Gupta");
		
		
		
		//Object name : agrument 
		for (Person person : persons )
		{
			person.print();
		}
	}

}
