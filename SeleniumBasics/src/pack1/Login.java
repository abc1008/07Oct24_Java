package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import utility.CaptureScreen;
import utility.CommonOps;
import utility.JSMethods;

public class Login
{
	public static WebDriver driver = null;
	
	

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
//		System.out.println(browser);
		
		
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
		

		driver.manage().window().maximize();
		driver.get(CommonOps.readConfig("TestSiteURL"));
		Thread.sleep(2000);

		// locate the webelemet
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(CommonOps.readConfig("UserID"));

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(CommonOps.readConfig("Password"));

		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement loginButton = driver.findElement(By.xpath("//input[contains(@class,' btn-')]"));

		// Javascript Click
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginButton);
		
		JSMethods.click(driver, loginButton);
		

		// *** Logout ******

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("gout")).click();
		
		
		WebElement logoutText = driver.findElement(By.xpath("//div[@id='content']//h1"));
		
		String textOnUi = logoutText.getText();
		
		if(textOnUi.equals("Account Log"))
		{
			System.out.println("Logout is successful");
		}
		else
		{
			System.out.println("Logout is failed");
			
//			TakesScreenshot screen = (TakesScreenshot) driver; // typecast driver
//			File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking SS and storing in variable
//			File path = new File("D:\\Trainings\\TESTOMETER\\07_OCT_2024_WEEKDAY_EVE\\Screenshots\\TestSS.JPEG"); // decide Path
//			Files.copy(screenShot, path);
			
	
			CaptureScreen.printScreen("Test_1");
			
			
		}



	}

}
