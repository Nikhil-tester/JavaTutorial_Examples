package accessmodifiers;

class Test114{
	
	private String name, emailID;
	private long accNo;
	private float amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
}


public class Ex114 {

	public static void main(String[] args) {
		
		Test114 obj114=new Test114();
		obj114.setName("Amit");
		obj114.setEmailID("amit@gmail.com");
		obj114.setAccNo(1212120);
		obj114.setAmount(15000f);
		
		System.out.println("Acount Holder Name : "+obj114.getName());
		System.out.println("Email ID : "+obj114.getEmailID());
		System.out.println("Account Number : "+obj114.getAccNo());
		System.out.println("Amount present on account : "+obj114.getAmount());

	}

}
