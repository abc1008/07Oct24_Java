package pack1;

public class MethodDiscussion2
{
	public static void method1()
	{
		System.out.println("Hello World");
		
		MethodDiscussion2 ref1 = new MethodDiscussion2();
		ref1.nonStaticMethod1();
		
		System.out.println("After non-static method call");
		
	}
	
	public void nonStaticMethod1()
	{
		System.out.println("nonStaticMethod1");
		
//		methodName();
//		method1();
//		System.out.println("After static method call");
	}
	
	public void nonStaticMethod2()
	{
		System.out.println("nonStaticMethod2");
		
		nonStaticMethod1();   // non-static method of same class
		
		MethodDiscussion m1 = new MethodDiscussion();
		m1.nonStaticMethod1_MethodDiscussion();  // non-static method of another class
		
		
	}
	
	public static void main(String[] args)
	{
//		method1();
		
		MethodDiscussion2 ref1 = new MethodDiscussion2();
		ref1.nonStaticMethod2();
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
}
