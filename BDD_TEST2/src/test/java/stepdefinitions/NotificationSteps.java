package stepdefinitions;

import java.io.IOException;

import app_objects.TestometerObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NotificationSteps {
	
	@Given("User clicks notification icon")
	public void clickOnIcon()
	{
		TestometerObjects.dashboardPage().clickNotitificationIcon();
	}
	
	@Then("View All button is displayed.")
	public void verifyViewAllButton() throws IOException
	{
		TestometerObjects.dashboardPage().verifyViewAll();
	}

}
