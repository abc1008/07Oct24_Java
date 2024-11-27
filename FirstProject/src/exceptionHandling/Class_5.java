package exceptionHandling;


public class Class_5
{


	
	
	public static void main(String[] args)
	{

		
		int a = 100;
		
		if(a > 10)
		{
//			throw new ExceptionName("message");    --> SYNTAX
			throw new StringIndexOutOfBoundsException("a is greater than 100");
			

		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("a is less than 100");
		}
		
	
	
	
	}
	
	
	

}
