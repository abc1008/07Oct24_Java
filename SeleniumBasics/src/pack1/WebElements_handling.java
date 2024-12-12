package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements_handling
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
		driver.get("https://devsite.testometer.co.in/login");
		Thread.sleep(2000);

		
		// find checkbox and click 
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='is_instructor']"));
		
		
//		boolean isChkBoxChecked = checkbox.isSelected();
//		
//		System.out.println("Default checkbox checked status : " + isChkBoxChecked);
//		
//		if(isChkBoxChecked == false)
//		{
//			System.out.println("Checking/Selecting the checkbox.");
//			checkbox.click();
//		}
//		else
//		{
//			System.out.println("Checkbox is already selected.");
//		}
//		
//		isChkBoxChecked = checkbox.isSelected();
//		
//		if(isChkBoxChecked == false)
//		{
//			System.out.println("Checking/Selecting the checkbox.");
//			checkbox.click();
//		}
//		else
//		{
//			System.out.println("Checkbox is already selected.");
//		}

		
		boolean isChkBoxEnabled = checkbox.isEnabled();
		
		System.out.println("Default checkbox enabled status : " + isChkBoxEnabled);
		
		
		boolean isChkBoxDisplayed  = checkbox.isDisplayed();
		
		System.out.println("Default checkbox visibllity status : " + isChkBoxDisplayed);
	}
	
	
	
	
	
	
	
}
