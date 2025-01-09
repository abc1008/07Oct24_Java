package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import testScriptClasses.HeaderTestScript;
import testScriptClasses.LoginTestScript;
import utility.CommonOps;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		
		 String browserName = CommonOps.readConfig("Browser");
		 
		 if(browserName.equals("CHROME"))
			 driver = new ChromeDriver();
		 else if(browserName.equals("EDGE"))
			 driver = new EdgeDriver();
		 else
			 System.out.println("Browser Name is incorrect.");
		
		
		driver.manage().window().maximize();
		driver.get(CommonOps.readConfig("TestSiteURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@BeforeMethod
	public void login() throws IOException
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
