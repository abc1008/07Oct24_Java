package pack1;

public class ConstructorBasics  
{

	
//	SYNTAX:
	
//	ClassName()
//	{
//		// constructor body
//	}
	
	static int c = 799;
	int a;
	int b;
	
	ConstructorBasics(int num1, int num2)  // to initialize the non-static variables of class.
	{
		a = num1;
		b = num2; 
		
		System.out.println("int, int  Constructor");
	}
	
	ConstructorBasics(int x, boolean b)
	{
		System.out.println("int, boolean  Constructor");
	}
	
	ConstructorBasics(boolean b, int x)
	{
		this();
		System.out.println("boolean, int  Constructor");
	}
	
	ConstructorBasics()
	{
		this(8,9);  // call Constructor inside another Constructor
//		this(7, false);
		System.out.println("Zero arg  Constructor");
		
	}

	
	public void m1()
	{
		System.out.println(a + b);
	}
	
	public static void main(String[] args)
	{
		ConstructorBasics c1 = new ConstructorBasics(56, 89);
		
		
		
		ConstructorBasics c3 = new ConstructorBasics(true, 9);
		
		
		ConstructorBasics c2 = new ConstructorBasics();
		
		
		
		
		
		
		
		
		
		
	}

}

