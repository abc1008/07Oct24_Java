package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage
{

	
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	
	
	@FindBy(xpath = buttonNewVersionByXpath)
	private WebElement buttonNewVersion;
	
	
	// constructor
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	
	public void selectNewVersionFromLeftMenu()
	{
		buttonNewVersion.click();
		System.out.println("Clicked on new verison");
	}
	
	
	
	
}
