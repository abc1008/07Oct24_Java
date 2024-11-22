package interface_discussion;

public class TestClass2 extends TestClass1
{

	public void m3()
	{
		System.out.println("m3 of TestClass1");
	}
	
	
	public static void main(String[] args)
	{
		
		// method calling
		
		TestClass2 t2 = new TestClass2();
		t2.m1();
		t2.m2();
		t2.m3();
		
		
		// Interface ref and Implementation Class Object
		Interface_1 v1 = new TestClass2();
		v1.m1();
		v1.m2();
		v1.m3();
		
	}

}
