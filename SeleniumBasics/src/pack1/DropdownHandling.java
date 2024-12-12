package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling
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
		driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fmbasic.facebook.com%2Fsettings&locale=en_GB&display=page");
		Thread.sleep(2000);
		
		
		WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		dayDropdown.click();
		
		List<WebElement> daysFromDrop = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		for(WebElement day : daysFromDrop)
		{
			String textFromUI = day.getText();
			System.out.println(textFromUI);
			
			
			if(textFromUI.equals("20"))
			{
				day.click();
				break;
			}
			
		}

		System.out.println("After for loop.");
		
		
		Thread.sleep(3000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(month);
		sel.selectByIndex(2);   // by index
		
		Thread.sleep(3000);
		sel.selectByValue("5");  // value attribute
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Aug");  // visible text on UI
		
		
		
	}

}
