package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	// variables - 
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement textBoxUserIdByXpath;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement textBoxPasswordByXpath;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement buttonLoginByXpath;
	
	// variable Name :  controlName_FielName_Locator
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    // refers to the non-static variables of current class. 
	}
	
	// methods
	public void login()
	{
		textBoxUserIdByXpath.sendKeys("adityaganjkar88@gmail.com");
		textBoxPasswordByXpath.sendKeys("abcd@1234");
		buttonLoginByXpath.click();
	}
	
	
	
	
	
	
	

}
