package testPack1;

import org.testng.annotations.Test;

public class TestClass_1
{
	
	@Test(priority = 2)
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	@Test(priority = 20, enabled = false)
	public void m2()
	{
		System.out.println("m2 method");
	}
	
	@Test(priority = 100, invocationCount = -3)
	public void zm3()
	{
		System.out.println("m3 method");
	}
	
	@Test(priority = 100)
	public void m4()
	{
		System.out.println("m4 method");
	}

}
