package inheritance;

//Multilevel Inheritance Example

class Dogs{
	void brack() {
		System.out.println("Dog Bracks ...");
	}
}

class Cats extends Dogs{
	void mewo() {
		System.out.println("Cat Mewo ...");
	}
}

class Elephant extends Cats{
	void ahhuu() {
		System.out.println("Elephant ahhuu ...");
	}
}
public class Ex3 {

	public static void main(String[] args) {
	
	Elephant s1=new Elephant();
	s1.brack();
	s1.mewo();
	s1.ahhuu();
		

	}

}
