package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	static WebDriver driver;
	
	@Given("user is on Login screen")
	public void LaunchSite()
	{
		driver = new ChromeDriver();
		driver.get("https://devsite.testometer.co.in/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@When("user enters valid credentials")
	public void enterCredentials()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("adityaganjkar88@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcd@1234");
		
	}
	
	@And("hits login button")
	public void hitLoginButton()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Then("user must be logged in successfully.")
	public void loginVerify()
	{
		List<WebElement> newVersionButton = driver.findElements(By.xpath("//b[text()='New Version']"));
		
		if(newVersionButton.size() > 0)
		{
			System.out.println("Login Successful.");
		}
		else
		{
			System.out.println("Login Failed.");
		}
		
	}
	
	

}
