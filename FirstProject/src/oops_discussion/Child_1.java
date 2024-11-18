package oops_discussion;

public class Child_1 extends Parent_1
{
	private final static int var1 = 800;
	final int var2 = 700;

	protected int m1()
	{
		System.out.println("m1 of Child_1");

		return 10;
	}
	


	public void m3(int a) // overloaded
	{
		System.out.println("1 arg - m3 of Child_1");
	}
	
	public static void m4()
	{
		System.out.println("m4 of Child_1");
	}

	public static void main(String[] args)
	{

//		var1 = 900;

		System.out.println();
		System.out.println("*** Child Methods ***");
		System.out.println();

		Child_1 ref1 = new Child_1(); // child ref + child obj
		ref1.m1(); // Overridden
		ref1.m2(5); // Overridden
		ref1.m3(6); // overloaded
		System.out.println(ref1.var1);

//		ref1.var2 = 88;

		System.out.println();
		System.out.println("*** Parent Methods ***");
		System.out.println();

		// int a = 10;
		Parent_1 ref2 = new Parent_1(); // Parent_1 ref + Parent_1 obj
		ref2.m1(); // Overridden
		ref2.m2(6); // Overridden
		ref2.m3(); // overloaded
		System.out.println(ref2.var1);

		System.out.println();
		System.out.println("*** Parent_1 ref + Child obj ***");
		System.out.println();

		
		
		Parent_1 ref3 = new Child_1(); // Parent_1 ref + Child obj
		ref3.m1(); // Overridden : object will decide which method to call
		ref3.m2(6); // Overridden : object will decide which method to call
		ref3.m3(); // overloading :ref variable will decide which method to call
		System.out.println(ref3.var1);
		
		ref3.m4();    // method hiding
		
		
		

		System.out.println();
		System.out.println("*** Child ref + Parent obj ***");
		System.out.println();

//		Child_1 ref4 = new Parent_1();    //  not possible

	}

}
