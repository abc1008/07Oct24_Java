package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSMethods
{
	
	/**
	 * Method to perform javascript click
	 * @param driver
	 * @param ele
	 */
	public static void click(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	
	/**
	 * Method to perform scroll operation over a WebElement
	 * @param driver
	 * @param ele 
	 */
	public static void scrollTo(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	

}
