package testSuits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testScriptClasses.LoginTestScript;

public class LoginTestSuite
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devsite.testometer.co.in/login");
	}

	
	@Test
	public void tc123_LoginTest()
	{
		LoginTestScript loginTest = new LoginTestScript();
		loginTest.performLogin();
	}
	
	
	

}
