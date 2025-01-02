package testPack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass4
{

	@Test
	public void m1()
	{
		System.out.println("m1 method");
		Assert.fail();
	}
	
	@Test
	public void m2()
	{
		System.out.println("m2 method");
		Assert.fail();
	}
	
	@Test
	public void m7()
	{
		System.out.println("m7 method");
	}
	
	
	@Test
	public void m8()
	{
		System.out.println("m8 method");
	}
	
	@Test
	public void m10()
	{
		System.out.println("m10 method");
		Assert.fail();
	}
}
