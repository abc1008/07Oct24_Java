package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers
{
	static WebDriverWait wait;
	
	public WaitHelpers(WebDriver driver)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	public  void WaitForEleToBeVisible(String xpath)
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
	}
	
	public  void WaitForEleToBeInVisible(String xpath)
	{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void WaitForEleToBeClickable(WebElement ele)
	{
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
