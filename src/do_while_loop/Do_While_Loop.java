package do_while_loop;

public class Do_While_Loop {

	/*
diff b/w while and do while loop is 

while loop first evaluate the condition and execute. 
if condition is not match to the statement the state will not execute at all
do while loop first execute the statement and evaluate the condition. 
If condition is not match, at-lest statement will execute one time

	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("--while loop--");
		
		int a = 0;
		
		while(a <= 10) //check the condition then execute the statement (a=-1)
		{
			System.out.println(a);
			a++;
		}
		
		System.out.println("--do while loop--"); 
		
		int b=0;
		
		do {							//first execute the statement and than check the condition (b=-1)
			System.out.println(b);
			b++;
		}while(b<=10);

	}

}
