package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframes
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
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(4000);
		
		WebElement iframeFrame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframeFrame3);   // to switch selenium focus from main webpage to iframe 
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("abc");
		
		
		// handle frame 4
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent(); // to switch from iframe to main webpage/frame

		WebElement iframeFrame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(iframeFrame4);   // to switch selenium focus from main webpage to iframe 
		
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("pqr");
		
		
		// radio button 
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(iframeFrame3);   // to switch selenium focus from main webpage to iframe 
		
		WebElement frameInsideFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d/1yfUq')]"));
		driver.switchTo().frame(frameInsideFrame);  
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		
		
		// again handle frame 3
		
		Thread.sleep(2000);
		
//		driver.switchTo().defaultContent(); 
//		driver.switchTo().frame(iframeFrame3); 
		
//						OR
		
		driver.switchTo().parentFrame(); // to immediate parent 
		
		WebElement text = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text.clear();
		text.sendKeys("tuv");
		
		
		
		
	}
	
	
	
	
	
	
}
