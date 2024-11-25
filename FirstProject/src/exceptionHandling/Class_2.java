package exceptionHandling;

public class Class_2
{
	int x;
	boolean result;
	Class_2 c1;    // null
	
	public void createUser()
	{
		
		try
		{
			
			
			
			
			
			
			
			
			
		}
		catch(NullPointerException e)
		{
			
		}
		finally
		{
			
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{

		try
		{
			int []  arr = {5,6,7,8,9};
			System.out.println(arr[2]);
//			System.out.println(arr[8]);
			
			System.out.println("After array");
			
			// db coonect open 
			// exception
		}
		catch(Exception ex)
		{
			System.out.println("Exception Found : "+ ex.getMessage());
			
		}
		finally 
		{
			System.out.println("finally block");
		}

		
		System.out.println("After try-catch");
		
		// connect close
		
	}
	
	
	
	
	
	
	

}
