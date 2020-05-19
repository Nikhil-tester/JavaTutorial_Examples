package exception;

public class Ex2 {

	public static void main(String[] args) {
		
		try {
			int arr[]= {11,22,33};
			System.out.println(arr[4]);
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Excute rest code");

	}

}
