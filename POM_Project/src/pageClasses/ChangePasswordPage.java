package pageClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.CaptureScreen;
import utility.SeleniumEventHelpers;
import utility.WaitHelpers;

public class ChangePasswordPage
{
	WebDriver driver;
	private final String dropdownUserByID = "page-header-user-dropdown";
	private final String buttonChangePassByXpath = "//span[text()='Change Password']";
	private final String textBoxPasswordByXpath = "//input[@name='password']";
	private final String textBoxConfPasswordByXpath = "//input[@name='confirm_pass']";
	private final String buttonUpdateByXpath = "//button[text()='Update']";
	private final String alertSuccessByXpath = "//span[text()='Success!']";

	@FindBy(id = dropdownUserByID)
	private WebElement dropdownUser;

	@FindBy(xpath = buttonChangePassByXpath)
	private WebElement buttonChangePass;

	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = textBoxConfPasswordByXpath)
	private WebElement textBoxConfPassword;

	@FindBy(xpath = buttonUpdateByXpath)
	private WebElement buttonUpdate;

	@FindBy(xpath = alertSuccessByXpath)
	private List<WebElement> alertSuccess;

	
	// constructor
	public ChangePasswordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // refers to the non-static variables of current class.
	}

	// methods
	public boolean changePassword() throws IOException
	{
		boolean testResult = true;
		
		try
		{
			SeleniumEventHelpers.DoClick(dropdownUser);
			buttonChangePass.click();
			textBoxPassword.sendKeys("abcd@1234");
			textBoxConfPassword.sendKeys("abcd@1234");
			buttonUpdate.click();

			if (alertSuccess.size() > 0)
			{
				System.out.println("Password updated successfully");
				new WaitHelpers(driver).WaitForEleToBeInVisible(alertSuccessByXpath);
				
			} 
			else
			{
				System.out.println("Failed to update Password.");
				CaptureScreen.printScreen("TestFile", driver);
				testResult = false;
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found in method 'changePassword' : "+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
	}

}
