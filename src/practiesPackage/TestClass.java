package practiesPackage;

public class TestClass {

	public static void main(String[] args) {
		{
		int x=10;
			
			if(x==20) {
				System.out.println("correct statement");
			}
			else {
				System.out.println("incorrect statement");
			}
		}
			
		int arr[]= {1,77,3,4,5};
		
		for(int index=0 ; index<arr.length;index++) {
			
			System.out.println(arr[index]);
		}
		
		int a=0;
		int b=10;
		
		while(a <=10) {
			System.out.println(a++);
		}
		while(b >=0) {
			System.out.println(b--);
		}
		
		int n=0;
		
		do {
			System.out.println("doWhileLoop : "+n++);
		}
		while(n<=10);		
	
		for(int ii=0;ii<=10;ii++) {
			System.out.println(ii);{
				if(ii==8) {
					break;
				}
			}
			
		int myarr[]= {1,2,3,2,2,4,5,2,1,4,2};
		
		for(int x=0; x<myarr.length;x++) {
			System.out.println("test:"+myarr[x]);
			if(x==3) {
				break;
			}
		}
		
			
			
		}
		
		
	
	}
}
