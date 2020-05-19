package static_j;

class Example3{
	static int count =0; //will get memory only once and retain its value 
	
	Example3(){
		count++;
		System.out.println(count);
	}
}

public class Ex3 {

	public static void main(String[] args) {
		Example3 s1=new Example3(),
				 s2=new Example3(),
				 s3=new Example3();

	}

}
