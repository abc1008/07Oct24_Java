package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = null;

		String browserName = "CHROME";

		if (browserName.equals("CHROME"))
		{
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("EDGE"))
		{
			driver = new EdgeDriver();
		} else
		{
			driver = new EdgeDriver();
			System.out.println("Invlid browser.");
		}

		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);

		// locate the webelemet
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("adipersonal570@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Unlock@123");
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,' btn-')]")).click();
		
		
		//  *** Logout ******
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("gout")).click();

	}

}
