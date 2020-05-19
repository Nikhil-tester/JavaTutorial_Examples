package accessmodifiers;

public class AccessModifiers {
	
	/**
Public, Private, Protected are Access Modifiers
Basically Access Modifiers allow to access the class present on package, class, method 
depending upon the keyword we can access the class, package, method or project
good practices not to give public access modifier, allow declare as private or protected
Basic logic behind that to not to give direct access, might affected by any other user
always try to give indirect access to variable using getter and setter method
#private class variables can be access by other class by using getter and setter method
#by using getter & setter method we access the variable of private indirectly
#inside getter & setter method this keyword means member of class not method, 
#java will not know which keyword we referring 
#this keyword use for two variable with same name, but want to use member variable
#inside the method variable is local variable, using this. uses the member variable
	 */
	
/* Access Levels
Modifier		Class		Package		Subclass		World
public			 Y			  Y				Y			  Y
protected		 Y			  Y				Y			  N
no modifier		 Y			  Y				Y  			  N
private 		 Y			  N				N			  N 
 */
	
	
	public static void main(String[] args) {
		
		//creating a instance of a class for no modifier
		MyClass Student = new MyClass();
		
		//By using getter & setter method access the private class were we setting up a name indirectly
		Student.setName("Mark");
		Student.setAge(10);
		
		//By using getName/getAge method printing the setName/setAge 
		System.out.println(Student.getName());
		System.out.println(Student.getAge());
	}

}
