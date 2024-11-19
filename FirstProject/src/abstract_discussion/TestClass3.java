package abstract_discussion;

public class TestClass3 extends TestClass2
{

	public void m3()
	{
		System.out.println("m3 method implementation");
		
	}

	
	public static void main(String[] args)
	{
		
//		TestClass1 t1 = new TestClass1();
		
		TestClass3 t3 = new TestClass3();  // oject of child class
		t3.m1();
		t3.m2();
		t3.m3();
		
		System.out.println();
		
		// abstract ref and child object
		TestClass2 t2  = new TestClass3();
		t2.m1();
		t2.m2();
		t2.m3();
		
		
		TestClass1.m5();
		
	}

}
