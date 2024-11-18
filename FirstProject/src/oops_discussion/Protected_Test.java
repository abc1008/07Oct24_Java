package oops_discussion;

import access_modifiers.ClassB;

public class Protected_Test extends ClassB
{
	
	
	public static void main(String[] args)
	{
		
		System.out.println(ClassB.a);
		ClassB.m1();
		
		
		// non-static
		
		Protected_Test ref1 = new Protected_Test();
		ref1.m2();
		System.out.println(ref1.b);
		
		
	}
	
	

}
