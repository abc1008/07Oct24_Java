package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	private WebElement alertSuccess;

	
	// constructor
	public ChangePasswordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // refers to the non-static variables of current class.
	}

	// methods
	public void changePassword()
	{
		dropdownUser.click();
		buttonChangePass.click();
		textBoxPassword.sendKeys("abcd@1234");
		textBoxConfPassword.sendKeys("abcd@1234");
		buttonUpdate.click();

		boolean isSuccess = alertSuccess.isDisplayed();

		if (isSuccess == true)
		{
			System.out.println("Password updated successfully");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOf(alertSuccess));
		} 
		else
		{
			System.out.println("Failed to update Password.");
		}
	}

}
