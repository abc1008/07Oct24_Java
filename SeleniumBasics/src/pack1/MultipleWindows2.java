package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindows2
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
		driver.get("https://www.naukri.com/");

		
		String winHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window : " + winHandle);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Thread.sleep(2000);
		
		
		System.out.println();
		System.out.println("All Window Handles");
		System.out.println();


		
//		for( String window : allWinds)
//		{
//			if(!window.equals(winHandle))
//			{
//				driver.switchTo().window(window);   // to switch the focus
//				System.out.println("Switched : " +window);
//				
//				driver.findElement(By.xpath("//span[@title='Engineering Jobs']")).click();
//				Thread.sleep(2000);
//			}
//		}
		
		// Code to switch to Nth window:  using ArrayList 
		
		Set<String> allWinds = driver.getWindowHandles();
		
		ArrayList<String> allWinsList = new ArrayList<String>(allWinds);
		
		System.out.println(allWinsList.get(0));
		System.out.println(allWinsList.get(1));
		System.out.println(allWinsList.get(2));
		System.out.println(allWinsList.get(3));
		
		Thread.sleep(5000);
		driver.switchTo().window(allWinsList.get(2));  
		System.out.println();
		System.out.println("Switched: "+allWinsList.get(2));
	}
	
	
	
	

}
