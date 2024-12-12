package pack1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClass
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		
		String browserName = "CHROME";
		
		if(browserName.equals("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("EDGE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new EdgeDriver();
			System.out.println("Invlid browser.");
		}
		
		// Basic Commands/Methods of Selenium
		driver.manage().window().maximize();    // browser will be maximized
		driver.get("https://www.google.com/");  // hit url
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");  // hit url
		Thread.sleep(1000);
		driver.navigate().back();   // browser back
		Thread.sleep(1000);
		driver.navigate().forward();  // browser forward
		Thread.sleep(1000);
		driver.navigate().refresh();  // refresh browser window
		
		
		String title = driver.getTitle();   // returns title of webpage
		System.out.println(title);
		
		
		if(title.contains("facebook"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
