package superkeyword;

class Person{
	int id;
	String name;
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
}

class Emps extends Preson{
	float salary;
	Emps(int id, String name, float salary)
	{
		super(id, name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

class Example1  {
		public static void main(String[] args) {	
			Emps obj= new Emps(11, "mikcy", 10000);
			Emps obj1= new Emps(12, "nike", 10000);
			obj.display();
			obj1.display();
	}	
}
