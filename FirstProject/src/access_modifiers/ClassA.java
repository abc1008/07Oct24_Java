package access_modifiers;

public class ClassA
{
	
	public static void main(String[] args)
	{
		
		
		System.out.println(ClassB.a);
		ClassB.m1();
		
		// non-static
		
		ClassB ref1 = new ClassB();
		ref1.m2();
		
		System.out.println(ref1.b);
		
	}

}
