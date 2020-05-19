package static_j;

class Example2{
	int count=0;//will get memory each time when the instance is created must see Ex3 class
	
	Example2() {
		count++;
		System.out.println(count);
	}
	
}

public class Ex2 {

	public static void main(String[] args) {
		
		Example2 s1=new Example2(),
				 s2=new Example2(),
				 s3=new Example2();
		
		

	}

}
