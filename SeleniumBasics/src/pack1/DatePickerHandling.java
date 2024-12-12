package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePickerHandling
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = null;

		String browserName = "CHROME";

		if (browserName.equals("CHROME"))
		{
			driver = new ChromeDriver();
		} else if (browserName.equals("EDGE"))
		{
			driver = new EdgeDriver();
		} else
		{
			driver = new EdgeDriver();
			System.out.println("Invlid browser.");
		}

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(2000);

		String dayToSelect = "10";
		
//		WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		
		

		while(true)
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthYear.getText();
			
			System.out.println(monthYearText);
			
			if (!monthYearText.equals("December 2019"))
			{
				WebElement prev = driver.findElement(By.xpath("//a[@title='Prev']"));
				prev.click();
			} 
			else
			{
				break;
			}
		}
		
		System.out.println("Out of while loop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='" + dayToSelect + "']")).click();

	}
}
