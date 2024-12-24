package pack1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JSMethods;

public class WaitsDiscussion3
{

	
	public static void main(String[] args)
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
			System.out.println("Invlid browser : ");
		}
					
		
		System.out.println("Browser launched : "+ browserName);
		// maximum waiting time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		System.out.println("Clicked on button xyz");
		
		WebElement textBox = driver.findElement(By.xpath("//div[@id='main']//input[@id='txt']"));
		
		
		
//		Explicit Wait Syntax:
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		FluentWait Syntax :
		FluentWait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(NullPointerException.class)
				.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.visibilityOf(textBox));
		
		textBox.sendKeys("Explicit Wait");
		System.out.println("Data sent");

		
	}
	
	
	
	
	
	
	
}


