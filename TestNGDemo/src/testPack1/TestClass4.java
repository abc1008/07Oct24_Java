package testPack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass4
{

	@Test(groups = "Regression")
	public void m1()
	{
		System.out.println("m1 method");
		Assert.fail();
	}
	
	@Test(groups = "Sanity")
	public void m2()
	{
		System.out.println("m2 method");
		Assert.fail();
	}
	
	@Test(groups = "Regression")
	public void m7()
	{
		System.out.println("m7 method");
	}
	
	
	@Test(groups = "Sanity", dependsOnGroups = "Regression")
	public void m8()
	{
		System.out.println("m8 method");
	}
	
	
	@Test(groups = "Group3")
	public void m10()
	{
		System.out.println("m10 method");
		Assert.fail();
	}
	
	
}
