package oops_discussion;

public class Polymorphism_Discussion
{
	public void m1()
	{
		System.out.println("m1");
	}
	
	
	public int  m1(int a)
	{
		System.out.println("int - m1");
		
		return a;
	}
	
	public static void m1(boolean a)
	{
		System.out.println("boolean - m1");
	}
	
	private void m1(int a, boolean b)
	{
		System.out.println("int, boolean - m1");
	}
	
	public void m1(boolean b, int a)
	{
		System.out.println("boolean, int -  m1");
	}
	
	
	
	public static void main(String[] args)
	{
		
		Polymorphism_Discussion ref1 = new Polymorphism_Discussion();
		
		ref1.m1(true,5);
		
		
		
		
	}
	
	
	
	
	

}
