package pageClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ExtentReportHelper;
import utility.WaitHelpers;

public class HeaderPage
{
	// variables - variable Name : controlName_FielName_Locator
	WebDriver driver;
	private final String dropdownUserByID = "page-header-user-dropdown";
	private final String buttonLogoutByXpath = "//span[text()='Logout']";
	private final String buttonLoginByXpath = "//button[@type='submit']";

	@FindBy(id = dropdownUserByID)
	private WebElement dropdownUser;

	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;

	@FindBy(xpath = buttonLoginByXpath)
	private List<WebElement> buttonLogin;

//	 List<WebElemet> loginButton = driver.findElements(By.xpath(""));

//   WebElemet  loginButton =  driver.findElement(By.xpath(""));

	// constructor
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // refers to the non-static variables of current class.
	}

	// methods
	public boolean logout() throws IOException
	{
		boolean testResult = false;

		try
		{
			dropdownUser.click();
			buttonLogout.click();

			new WaitHelpers(driver).WaitForEleToBeVisible(buttonLoginByXpath);

			if (buttonLogin.size() != 0)
			{
				ExtentReportHelper.logPass("Logout is successful");
				testResult = true;
			} 
			else
			{
				ExtentReportHelper.logFail("Logout is failed");
			}
		} 
		catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception found in method 'logout' :"+ex.getMessage());
			testResult = false;
		}

		return testResult;

	}

}
