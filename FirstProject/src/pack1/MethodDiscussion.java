package pack1;

public class MethodDiscussion
{

	
//	public static void methodName()
//	{
//		 // logic to be implemented
//	}
	
	public static void method1()
	{
		System.out.println("Hello World");
	}
	
	
	public static void addition()
	{
		System.out.println("addition");
	}
	
	public static void subtaction()
	{
		System.out.println("subtaction");
	}
	
	public static void division()
	{
		System.out.println("division");
	}
	
	
//	NonStatic Method SYNATX:
	
//	public void methodName()
//	{
//		// logic to be implemented
//	}
	
	public void nonStaticMethod1_MethodDiscussion()
	{
		System.out.println("nonStaticMethod1 from MethodDiscussion");
	}
	
	
	public static void main(String[] args)
	{
		// methodName();    -- SYNATX FOR CALLING STATIC METHOD
		method1();
		division();
		
		// non-static method call
		MethodDiscussion ref1 = new MethodDiscussion();
		ref1.nonStaticMethod1_MethodDiscussion();
		
		
		// binary langugae/machine language 
		
		
		String s = "aaa";
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
