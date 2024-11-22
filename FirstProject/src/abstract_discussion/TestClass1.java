package abstract_discussion;

public abstract class TestClass1
{
	static int a;
	
	
	
	TestClass1(int a)
	{
		System.out.println("TestClass1 Constructor");
	}
	
	
	
	
	
	
	// medical 
	public abstract void m1();  // abstract method or incomplete method
	
	public abstract void m3();
	
	
	
	
	public void m2()   // concrete method or complete method
	{
		System.out.println("m2");
		
		
		int a = 100;
		int b = 20;
		
		int ans = a * b;
		
		System.out.println(ans);
		ans = a + b;
		System.out.println(ans);
		
		
		
	}
	
	
//	public static abstract void m4();
	
	
	public static void m5()
	{
		int b = 200;
		System.out.println("m5");
		a = 100;
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		
		a = 500;
		
		System.out.println(a * 2);
		int b = 900;
		
		
		System.out.println("Before Debug");
		m5();
		
		int []  arr = new  int[5];
		
		
		main(arr);
		
		
		
		
	}
	
	
	public static void main(int [] args)
	{
		
		m5();
		
//		TestClass1 t1 = new TestClass1();
		
	}

}
