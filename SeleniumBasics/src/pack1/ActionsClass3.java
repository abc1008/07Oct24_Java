package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3
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
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(4000);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	
		// page scrolling 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", drop);

		// 1. Javascript command :  arguments[0].scrollIntoView();
		
		// 2. WebElement on which we want to scroll

		
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		
		act.clickAndHold(drag).moveToElement(drop).click().build().perform();   // drag and drop
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
