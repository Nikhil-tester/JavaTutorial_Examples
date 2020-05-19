package practiesPackage;

public class P3 {

	int id, qty;
	String name, author, publisher;
	
	P3(int id, String name, String author, String publisher, int qty){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+author+" "+publisher);
	}
	
	public static void main(String[] args) {
	
		P3 obj= new P3(11, "nikhi", "life", "gupta copier", 516),
		   obj1=new P3(12, "Jk", "Full of life 2", "john copier", 12211);
		obj.display();
		obj1.display();
	}

}
