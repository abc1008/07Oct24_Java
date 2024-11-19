package abstract_discussion;

public abstract class TestClass1
{
	
	
	// medical 
	public abstract void m1();  // abstract method or incomplete method
	
	public abstract void m3();
	
	
	
	
	public void m2()   // concrete method or complete method
	{
		System.out.println("m2");
	}
	
	
//	public static abstract void m4();
	
	
	public static void m5()
	{
		System.out.println("m5");
	}
	
	public static void main(String[] args)
	{
		
		
		m5();
		
//		TestClass1 t1 = new TestClass1();
		
	}

}
