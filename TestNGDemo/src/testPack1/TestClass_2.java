package testPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_2
{
	
	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("testCase1");
	}
	
	@Test(priority = 2)
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{

//		Login
		
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
//		Logout
		System.out.println("afterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
//		Launch browser
//		Hit URL
		System.out.println("beforeClass - TestClass_2");
	}
	
	@AfterClass
	public void afterClass()
	{
//		Close browser
		System.out.println("afterClass - TestClass_2");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}

}
