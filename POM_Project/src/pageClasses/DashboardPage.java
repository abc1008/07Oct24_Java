package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage
{

	
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	private final String dropdownUserByID = "page-header-user-dropdown";
	
	
	@FindBy(xpath = buttonNewVersionByXpath)
	private WebElement buttonNewVersion;
	
	@FindBy(id = dropdownUserByID)
	private List<WebElement>  dropdownUser;
	
	
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
	
	
	
	
}
