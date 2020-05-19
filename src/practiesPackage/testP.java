package practiesPackage;

public class testP {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		for(int i=0;i<=arr.length;i++) {
			if(i==8) {
				break;
			}
			System.out.println(arr[i]);
		}
		System.out.println("complete");
		
		for(int index:arr) {
			if(index==8) {
				break;
			}
			System.out.println(index);
		}
		for(int a =1; a<=3; a++) {
			for(int b =1; b<=3; b++) {
				if(a==3 && b==3) {
					continue;
				}
			System.out.println(a +""+b);
			}	
		}
	}
}



