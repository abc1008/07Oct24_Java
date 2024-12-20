package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopups
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
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(4000);
	
	
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();   // negative response i.e. No/Cancel
	
	
	
	
	
}
	
	
	

	
	

}
