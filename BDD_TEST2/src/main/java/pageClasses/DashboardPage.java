package pageClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExtentReportHelper;

public class DashboardPage
{

	
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	private final String dropdownUserByID = "page-header-user-dropdown";
	private final String buttonNotificationByXpath = "//button[@id='page-header-notifications-dropdown']";
	private final String buttonViewAllByXpath = "//a[text()=' View All']";
	
	
	
	@FindBy(xpath = buttonNewVersionByXpath)
	private WebElement buttonNewVersion;
	
	@FindBy(id = dropdownUserByID)
	private List<WebElement>  dropdownUser;
	
	@FindBy(xpath = buttonNotificationByXpath)
	private WebElement buttonNotification;
	
	@FindBy(xpath = buttonViewAllByXpath)
	private List<WebElement>  buttonViewAll;
	
	// constructor
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	
	/**
	 *Method to click on New Version button
	 * @return
	 */
	public boolean selectNewVersionFromLeftMenu()
	{
		boolean testResult = true;
		
		try
		{
			buttonNewVersion.click();
			System.out.println("Clicked on new verison");
			
			if(dropdownUser.size() > 0)
			{
				System.out.println("Clicked on New Version button");
			}
			else
			{
				System.out.println("Failed to clicked on New Version button");
				testResult = false;
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found in method 'selectNewVersionFromLeftMenu' : "+ex.getMessage());
			testResult = false;
		}

	
		return testResult;
	}
	
	
	public void clickNotitificationIcon()
	{
		buttonNotification.click();
		ExtentReportHelper.logInfo("Clicked on notification icon.");
	}
	
	public void verifyViewAll() throws IOException
	{
		if(buttonViewAll.size() > 0)
		{
			ExtentReportHelper.logPass("View All button verified successfullly.");
		}
		else
		{
			ExtentReportHelper.logFail("Failed to verify View All button.");
		}
	}
	
}
