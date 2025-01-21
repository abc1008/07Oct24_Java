package stepdefinitions;
import org.openqa.selenium.WebDriver;

import app_objects.TestometerObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChangePasswordSteps {
	
	@Given("User Clicks on profile icon and selects Change Password option")
	public void clickProfileIcon()
	{
		TestometerObjects.changePasswordPage().clickProfileIconAndSelectChangePass();
	}
	
	
	@And("Enters valid password and confirm password")
	public void enterCredentials()
	{
		TestometerObjects.changePasswordPage().enterCredentials();
		
	}
	
	@And("hits Update button")
	public void clickUpdate()
	{
		TestometerObjects.changePasswordPage().clickUpdate();
		
	}
	
	@Then("Password must be changed successfully.")
	public void verifyAlert()
	{
		TestometerObjects.changePasswordPage().verifyAlert();
	}	
	

}
