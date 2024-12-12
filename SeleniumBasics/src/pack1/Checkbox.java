package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox
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
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		
		
	}
}
