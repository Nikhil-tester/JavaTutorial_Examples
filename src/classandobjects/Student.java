package classandobjects;

/*
 * Member variables and methods will defined here
 * getter and setter method we are using here (because direct value can be access by other people)
 * select the variables, click on source -> select getter and setter , and select all values
 * assign value then system will use setID method
 * when ever we want to get value system will use getID method
 * this is called encapsulation
 */

public class Student {

	int id;
	String name;
	int age;
	
	//Below generated value got from getter and setter option
	
	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
