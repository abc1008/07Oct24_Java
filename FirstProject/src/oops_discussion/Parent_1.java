package oops_discussion;

public class Parent_1
{
	
	int var1 = 100;
	
	
	int m1()
	{
		System.out.println("m1 of Parent_1");
		
		return 1;
	}
	
	
	final void m2(int a)
	{
		System.out.println("m2 of Parent_1");
	}
	
	
	final void m2(int a, char c)
	{
		System.out.println("m2 of Parent_1");
	}
	
	
	static void m2(int a, boolean b)
	{
		System.out.println("m2 of Parent_1");
	}
	

	
	
	public void m3()
	{
		System.out.println("m3 of Parent_1");
	}
	
	public static void m4()
	{
		System.out.println("m4 of Parent_1");
	}

	

}
