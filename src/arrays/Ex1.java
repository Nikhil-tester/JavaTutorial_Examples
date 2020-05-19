package arrays;
//Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array. 

public class Ex1 {

	public static void main(String[] args) {
	
	int number = 5;//declaration and instantiation  
		
	int a[]=new int[number];
	
	a[0]=10;//initialization  
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	//traversing array 
	for(int i=0;i<a.length;i++) 
		System.out.println(a[i]);
	

	}

}
