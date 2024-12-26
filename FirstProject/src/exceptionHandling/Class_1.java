package exceptionHandling;

public class Class_1
{
	int x;
	boolean result;
	Class_1 c1;    // null
	
	public static void main(String[] args)
	{
		Class_1 c2 = new Class_1();
		c2.c1 = new Class_1();
//		System.out.println(c1.x);
//		System.out.println(c1.result);
		

		System.out.println(c2.c1.x);
		
		int a = 5;
		Class_1 c1 = new Class_1();
		
		int b = 0;  
		int c = a/b;   // abnormal termination
		
		System.out.println(c);
		
		int []  arr = {5,6,7,8,9};
		
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		
		System.out.println("After array");
		
		
	
		
	}
	
	
	
	
	
	
	

}
