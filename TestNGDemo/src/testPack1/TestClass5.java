package testPack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass5
{
	@Test
	public void m3()
	{
		System.out.println("m3 method");
		Assert.fail();
	}
	
	@Test
	public void m4()
	{
		System.out.println("m4 method");
	}
	
	@Test
	public void m6()
	{
		System.out.println("m6 method");
	}
	

}
