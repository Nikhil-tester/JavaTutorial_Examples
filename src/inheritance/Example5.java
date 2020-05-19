package inheritance;

class EmpDetails{
	int empid;
	String empName, empDepartment, repoManager;
	EmpDetails(int empid, String empName, String empDepartment, String repoManager ){
		this.empid=empid;
		this.empName=empName;
		this.empDepartment=empDepartment;
		this.repoManager=repoManager;
	}
}

class EmpAddress{
	String empAdd, empCity, empState, empCountry;
	EmpAddress(String empAdd, String empCity, String empState, String empCountry ){
		this.empAdd=empAdd;
		this.empCity=empCity;
		this.empState=empState;
		this.empCountry=empCountry;
	}
}

class EmpAccount{
	String bankName, accNumber, codeIFSC;
	EmpAccount(String bankName, String accNumber, String codeIFSC){
		this.bankName=bankName;
		this.accNumber=accNumber;
		this.codeIFSC=codeIFSC;
	}
}

class Example5{
	EmpDetails empDetails;
	EmpAddress empAddress;
	EmpAccount empAccount;
	
	Example5(EmpDetails empDetails,EmpAddress empAddress, EmpAccount empAccount){
		this.empDetails=empDetails;
		this.empAddress=empAddress;
		this.empAccount=empAccount;
	}
	
	void Display() {
		System.out.println(empDetails.empid+" "+empDetails.empName+" "+empDetails.empDepartment+" "+empDetails.repoManager);
		System.out.println(empAddress.empAdd+" "+empAddress.empCity+" "+empAddress.empState+" "+empAddress.empCountry);
		System.out.println(empAccount.bankName+" "+empAccount.accNumber+" "+empAccount.codeIFSC);
	}
	
	public static void main(String args[]) {
		
		EmpDetails E1 = new EmpDetails(10, "voda", "BI", "Ramani");
		EmpDetails E2 = new EmpDetails(11, "Mayank", "CA", "Ramani");
		
		EmpAddress A1 = new EmpAddress("J.P. Nagar", "Bangalore", "KA", "India");
		EmpAddress A2 = new EmpAddress("BTM", "Bangalore", "KA", "India");
		
		EmpAccount AC1 = new EmpAccount("HDFC", "71268716861812111", "QASW1234567");
		EmpAccount AC2 = new EmpAccount("AXIS JP Nagar", "78126816811111", "JPSW1234567");
		
		Example5 Obj1 = new Example5(E1, A1, AC1);
		Example5 Obj2 = new Example5(E2, A2, AC2);
		
		Obj1.Display();
		System.out.println("===***===");
		Obj2.Display();	
	}
}
