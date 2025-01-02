package testPack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class TestClass_2
{
	
	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("testCase1");
		
		// soft assert
		
		SoftAssert sa = new SoftAssert();
//		sa.fail();
		System.out.println("After Assert fail");
		
		
		sa.assertTrue(false);
		sa.assertFalse(false);
		sa.assertEquals("", "");
		sa.assertNotEquals("", "");
		
		
		sa.assertAll();
		
		System.out.println("After Assert All");
		
		
		
	}
	
	@Test(priority = 2)
	public void testCase2()
	{
		// hard assert
		System.out.println("testCase2");
		
//		Assert.fail();   // used for failing a test case
		
		
//		String textfromWebElement = "Logout";
		
//		Assert.assertEquals(textfromWebElement, "Logout Successful");
		
		boolean result = true;
		
//		Assert.assertTrue(result, "Test case failed.");
		
//		Assert.assertFalse(result);
		
		Assert.assertNotEquals(result, false);
		
		
		System.out.println("After Assert");

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
