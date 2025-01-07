package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage
{
	
	// variables -  variable Name :  controlName_FielName_Locator
	private final String dropdownUserByID = "page-header-user-dropdown";
	private final String buttonLogoutByXpath = "//span[text()='Logout']";
	
	
	@FindBy(id = dropdownUserByID)
	private WebElement dropdownUser;
	
	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;
	
	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	// methods
	public void logout()
	{
		dropdownUser.click();
		buttonLogout.click();
	}
	

}
