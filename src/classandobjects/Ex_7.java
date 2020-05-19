package classandobjects;

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+" deposit");
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println(" Insufficient Amount");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+" withdraw");
		}
	}
	void checkBalance() {
		System.out.println("Balance is : "+ amount);
	}
	
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
}

public class Ex_7 {

	public static void main(String[] args) {
	
	Account s1=new Account(),
			s2=new Account();
	
	s1.insert(10101, "Amit", 1000);
	s1.display();
	s1.checkBalance();
	s1.deposit(40000);
	s1.checkBalance();
	s1.withdraw(10000);
	s1.checkBalance();
	
	s2.insert(10102, "Mayank", 1000);
	s2.display();
	s2.checkBalance();
	s2.deposit(10000);
	s2.checkBalance();
	s2.withdraw(40000);
	s2.checkBalance();
	}

}
