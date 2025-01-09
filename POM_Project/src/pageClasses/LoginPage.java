package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonOps;

public class LoginPage
{
	// variables -  variable Name :  controlName_FielName_Locator
	private final String textBoxUserIdByXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByXpath = "//input[@placeholder='Password']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	
	
	@FindBy(xpath = textBoxUserIdByXpath)
	private WebElement textBoxUserId;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	// methods
	public void login() throws IOException
	{
		textBoxUserId.sendKeys(CommonOps.readConfig("UserID"));
		textBoxPassword.sendKeys(CommonOps.readConfig("Password"));
		buttonLogin.click();
	}
	
	
	
	
	
	
	

}
