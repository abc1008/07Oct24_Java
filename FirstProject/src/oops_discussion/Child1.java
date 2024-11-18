package oops_discussion;

import access_modifiers.ClassB;

public class Child1 extends Parent
{
	
	int num1 = 650;   // non-static 

	public Child1()
	{
		super();
		System.out.println("Child1 Constructor");
	}
	
	
	public Child1(int a)
	{
		super(5,'c');
		System.out.println("Child1 Constructor");
	}
	
	public Child1(int a, int b)
	{
		super(5,'c', true);
		System.out.println("2 arg Child1 Constructor");
	}
	
	public void m5()
	{
		System.out.println("m5 method of Child1");
		
		System.out.println(super.num1);  // calling parent class duplicate variable
	}
	
	
	public static void main(String[] args)
	{
		
		Child1 c2 = new Child1();
		Child1 c3 = new Child1(2,4);
		System.out.println(c2.num1);  // child class duplicate variable
		
		Child1 c4 = new Child1();
		System.out.println(c4.num1);
		
		Parent p2 = new Parent(5);
		System.out.println(p2.num1);  // parent class duplicate variable
		
		c2.m5();

		
//		Parent p2 = new Parent();
//		p2.m1();
//		
//		Child1 c1 = new Child1(); // calling with Child Class Object
//		c1.m1();
//		
//		m7();   // parent class static method call 
//		
//		System.out.println(c1.num1);
//		System.out.println(s2);
		

		
//		System.out.println(ClassB.a);
//		
//		ClassB.m1();
		
		
		
	}
}
