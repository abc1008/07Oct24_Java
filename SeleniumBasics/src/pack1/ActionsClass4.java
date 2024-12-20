package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4
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
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ag89111@gmail.com");
		
		Thread.sleep(2000);
		
		Actions act = new  Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000);
		act.sendKeys("passord01").perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		

		
		
		
	}
	
	
	
	
	
	
	
	

}
