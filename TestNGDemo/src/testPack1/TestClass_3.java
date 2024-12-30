package testPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass_3
{
	
	@Test(priority = 1)
	public void testCase3()
	{
		System.out.println("testCase3");
	}
	
	@Test(priority = 2)
	public void testCase4()
	{
		System.out.println("testCase4");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
//		Launch browser
//		Hit URL
		System.out.println("beforeClass - TestClass_3");
	}
	
	@AfterClass
	public void afterClass()
	{
//		Close browser
		System.out.println("afterClass - TestClass_3");
	}


	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
}
