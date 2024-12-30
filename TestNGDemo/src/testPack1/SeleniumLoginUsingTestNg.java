package testPack1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.CommonOps;
import utility.JSMethods;

public class SeleniumLoginUsingTestNg
{
	static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws IOException, InterruptedException
	{
		String browserName = CommonOps.readConfig("Browser");

		if (browserName.equals("CHROME"))
		{
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("EDGE"))
		{
			driver = new EdgeDriver();
		} 
		else
		{
			driver = new EdgeDriver();
			System.out.println("Invlid browser.");
		}
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(CommonOps.readConfig("TestSiteURL"));

	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(CommonOps.readConfig("UserID"));


		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(CommonOps.readConfig("Password"));

//		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement loginButton = driver.findElement(By.xpath("//input[contains(@class,' btn-')]"));

		// Javascript Click
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginButton);
		
		JSMethods.click(driver, loginButton);
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		// *** Logout ******
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		driver.findElement(By.partialLinkText("gout")).click();
		
		
		WebElement logoutText = driver.findElement(By.xpath("//div[@id='content']//h1"));
		
		String textOnUi = logoutText.getText();
		
		if(textOnUi.equals("Account Logout"))
		{
			System.out.println("Logout is successful");
		}
		else
		{
			System.out.println("Logout is failed");
		}
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("testCase1 is executed");
	}
	

}
