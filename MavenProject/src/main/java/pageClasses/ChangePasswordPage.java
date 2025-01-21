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
import utility.ExtentReportHelper;
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
		 	ExtentReportHelper.logInfo("Clicked on User dropdown.");
			buttonChangePass.click();
			ExtentReportHelper.logInfo("Clicked on Change Password option from dropdown.");
			textBoxPassword.sendKeys("abcd@1234");
			ExtentReportHelper.logInfo("Entered New Password");
			textBoxConfPassword.sendKeys("abcd@1234");
			ExtentReportHelper.logInfo("Entered Confirm Password");
			buttonUpdate.click();
			ExtentReportHelper.logInfo("Clicked on Update button");
			

			if (alertSuccess.size() > 0)
				ExtentReportHelper.logPass("Password updated successfully");
			else
			{
				ExtentReportHelper.logFail("Failed to update Password.");
				CaptureScreen.printScreen("TestFile", driver);
				testResult = false;
			}
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception found in method 'changePassword' :"+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
	}

}
