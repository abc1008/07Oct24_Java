package pageClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonOps;
import utility.ExtentReportHelper;

public class LoginPage
{
	// variables -  variable Name :  controlName_FielName_Locator
	private final String textBoxUserIdByXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByXpath = "//input[@placeholder='Password']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	
	@FindBy(xpath = textBoxUserIdByXpath)
	private WebElement textBoxUserId;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = buttonNewVersionByXpath)
	private List<WebElement> buttonNewVersion;
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	// methods
	public boolean login() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			textBoxUserId.sendKeys(CommonOps.readConfig("UserID"));
			textBoxPassword.sendKeys(CommonOps.readConfig("Password"));
			buttonLogin.click();
			
			if(buttonNewVersion.size() > 0)
			{
				ExtentReportHelper.logPass("Login Successful.");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.logFail("Login Failed.");
			}
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception found in method 'login' :"+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
		
	}
	
	
	
	
	
	
	

}
