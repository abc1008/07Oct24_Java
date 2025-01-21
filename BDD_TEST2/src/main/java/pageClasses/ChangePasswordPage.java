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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
	public void clickProfileIconAndSelectChangePass()
	{
		driver.findElement(By.id("page-header-user-dropdown")).click();
		driver.findElement(By.xpath("//span[text()='Change Password']")).click();
		
	}
	
	
	public void enterCredentials()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//input[@name='confirm_pass']")).sendKeys("abcd@1234");
	}
	
	public void clickUpdate()
	{
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
	}
	
	public void verifyAlert()
	{
		 List<WebElement> alertSuccess = driver.findElements(By.xpath("//span[text()='Success!']"));
		 
		 
			if(alertSuccess.size() > 0)
			{
				ExtentReportHelper.logPass("Password changed Successfully.");
				new WaitHelpers(driver).WaitForEleToBeInVisible(alertSuccessByXpath);
			}
			else
			{
				System.out.println("Failed to change Password.");
			}
			
	}

}
