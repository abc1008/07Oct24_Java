package oops_discussion;

public class Child2 extends Child1
{
	
	public void m2()
	{
		System.out.println("m2 method of Child2");
	}

	
	public static void main(String[] args)
	{
		Child1 c1 = new Child1();
		c1.m1();
	}
}
