package arrays;

public class Ex9 {

	public static void main(String[] args) {
		
		System.out.println("printing original array");
		int arr[]= {11,22,10,33};
		for(int i:arr)
			System.out.println(i);
		
		System.out.println("printing clone array");
		int clone[]=arr.clone();
		for(int i:clone)
			System.out.println(i);
		
		System.out.println("are both array same ?");
			System.out.println(arr==clone);

	}

}
