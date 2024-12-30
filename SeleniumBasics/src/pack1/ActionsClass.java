package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
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
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(10000);   
		
		WebElement mp3 = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		Actions act = new  Actions(driver);
		act.moveToElement(mp3).perform();   // mouse hover
		System.out.println("End");
		
		Thread.sleep(2000);
		WebElement allMp3 = driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']"));
		act.click(allMp3).perform();  // click
		
		
		driver.close();  // currently focused window

		
		driver.quit();   // close entire browser
		
		
	
	}
	
	
	
	
	
	
	
	

}
