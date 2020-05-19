package classandobjects;

class Example{
	int lenght;
	int wigth;
	
	void insert(int l, int w) {
		lenght=l;
		wigth=w;
	}
	void calculation() {
		System.out.println(lenght*wigth);
	}
}

public class Ex_6 {

	public static void main(String[] args) {
	
	Example s1=new Example(), 
			s2=new Example(),
			s3=new Example();
	
	s1.insert(21, 11);
	s2.insert(10, 10);
	s3.insert(20, 30);
	
	s1.calculation();
	s2.calculation();
	s3.calculation();
	
	

	}

}
