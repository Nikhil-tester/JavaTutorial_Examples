package aggregation;

public class Emp {

	int id;
	String name;
	Address address;
	
	public Emp(int id, String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		Address address1=new Address("JashpurNagar", "Chhattisghar", "India");
		Address address2=new Address("Bangalore", "Karnataka", "India");
		
		Emp details1= new Emp(10, "Amit", address1);
		Emp details2= new Emp(11, "John", address2);
		
		details1.display();
		details2.display();
		
	}

}
