package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import testScriptClasses.HeaderTestScript;
import testScriptClasses.LoginTestScript;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devsite.testometer.co.in/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@BeforeMethod
	public void login()
	{
		LoginTestScript loginTest = new LoginTestScript();
		loginTest.performLogin();
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		HeaderTestScript hp = new HeaderTestScript();
		hp.performLogout();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();  
	}
	

}
