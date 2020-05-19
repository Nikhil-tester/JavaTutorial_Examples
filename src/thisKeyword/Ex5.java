package thisKeyword;
//Calling parameterized constructor from default constructor:

class Exmpl5{
	Exmpl5(){
		this(5);
		System.out.println("hello Ex5");
	}
	Exmpl5(int x){
		System.out.println(x);
	}
}

public class Ex5 {

	public static void main(String[] args) {
		Exmpl5 s1=new Exmpl5();

	}

}
