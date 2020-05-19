package inheritance;
//Hierarchical Inheritance Example
class Amit{
	void relationship() {
		System.out.println("son of mahesh");
	}
}
class Mona extends Amit{
	void relationshipes(){
		System.out.println("doughter of mahesh");
	}
}
class John extends Amit{
	void releaseshipone() {
		System.out.println("nothing");
	}
}
public class Ex4 extends John {
	public static void main(String[] args) {
		John s1=new John();
		s1.relationship();
		s1.releaseshipone();
	}
}
