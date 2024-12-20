package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindows
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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		String winHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window : " + winHandle);
		
		Thread.sleep(20000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		System.out.println();
		System.out.println("All Window Handles");
		System.out.println();

		Set<String> allWinds = driver.getWindowHandles();
		
		
		for( String window : allWinds)
		{
			
			if(!window.equals(winHandle))
			{
//			
				driver.switchTo().window(window);   // to switch the focus
				System.out.println("Switched : " +window);
				Thread.sleep(2000);
			}
			
		}
		
		
		
		
		
	}
	
	
	
	

}
