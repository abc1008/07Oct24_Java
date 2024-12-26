package oops_discussion;

public class Parent
{
	int num1 = 100;   // non-static 
	static String s2 = "Test";   // static 
	
	
	public Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	public Parent(int a)
	{
		System.out.println("1 arg - Parent Constructor");
	}
	
	public Parent(int a, char c)
	{
		
		System.out.println("2 arg - Parent Constructor");
	}
	
	public Parent(int a, char c, boolean b)
	{
		System.out.println("3 arg - Parent Constructor");
	}
	

	public void m1()
	{
		System.out.println("m1 method of Parent");
		
		int num5 = 80;
	}
	
	public void m2()
	{
		this.m1();
	}
	
	
	

	public static void m7()
	{
		System.out.println("m7 method of Parent");
	}

	public static void main(String[] args)
	{

		Parent p1 = new Parent(5);
		p1.m1();

		String s1 = p1.toString();
		System.out.println(s1);
		
		m7();
		
		
		System.out.println(p1.num1);
		System.out.println(s2);
		
		
		
		
		

	}

}
