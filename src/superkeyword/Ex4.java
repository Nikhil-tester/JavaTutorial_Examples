package superkeyword;

//Another example of super keyword where super() is provided by the compiler implicitly.

class AnimalTwo{

	 AnimalTwo() {
		System.out.println("Animal Created ....");
	}
}

class DogTwo extends AnimalTwo{
	
	DogTwo(){
		System.out.println("Dog is created ....");
	}
	
}


public class Ex4 {

	public static void main(String[] args) {
		
	new DogTwo();
	

	}

}
