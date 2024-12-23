package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JSMethods;

public class WaitsDiscussion2
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
			System.out.println("Invlid browser.");
		}
												// maximum waiting time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		WebElement button = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		JSMethods.scrollTo(driver, button);
		button.click();
		
		// Explicit Wait Syntax:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		
		
		// visibility/invisibility
		// clickable
		// alert 
		// presenceOfElementLocated
		// textToBePresentInElement
		// frameToBeAvailableAndSwitchToIt
		

		
	}
	
	
	
	
	
	
	
}


