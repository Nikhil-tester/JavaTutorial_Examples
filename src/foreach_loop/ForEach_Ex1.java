package foreach_loop;

public class ForEach_Ex1 {

	public static void main(String[] args) {

	/*
	 * The for-each loop is used to traverse array or collection in java. 
	 * It is easier to use than simple for loop because we don't need to increment value and use subscript notation
	 * 
	 * for(Type var:array){  
	 * code to be executed  
	 * }
	 */

	int arr[]= {12,23,123,121,112,11,11};
	for(int i:arr) {
		System.out.println(i);
	}
	
		
	}

}
