package classandobjects;


class Rectangle{
	static int length;
	static int width;
	
	static void insert(int l, int w) {
	
		length=l;
		width=w;
	}
	
	static void calculation() {
		System.out.println("length*width is :"+length*width);
	}
	
}

public class Ex_5 {

	public static void main(String[] args) {
	
	//Rectangle s1=new Rectangle();
	
	Rectangle.insert(55, 66);
	Rectangle.calculation();
	

	}

}
