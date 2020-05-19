package thisKeyword;

//Calling default constructor from parameterized constructor:


class Exm4{
	Exm4(){
		System.out.println("hello Exm4");
	}
	
	//The this() constructor call can be used to invoke 
    //the current class constructor. It is used to reuse the constructor. 
	//In other words, it is used for constructor chaining
	
	Exm4(int x){
		this();
		System.out.println(x);
	}
}

public class Ex4 {

	public static void main(String[] args) {
	
	Exm4 s1=new Exm4(10);

	}

}
