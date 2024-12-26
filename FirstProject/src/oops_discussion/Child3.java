package oops_discussion;

public class Child3 extends Child2
{
	
	public void m3()
	{
		System.out.println("m3 method of Child3");
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		Child3 c3 = new  Child3();
		
		c3.m2();
		c3.m1();
		c3.m3();

	}

}
