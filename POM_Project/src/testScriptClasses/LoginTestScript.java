package testScriptClasses;

import pageClasses.LoginPage;
import testSuits.LoginTestSuite;

public class LoginTestScript extends LoginTestSuite
{
	
	public void performLogin()
	{
		LoginPage lp = new LoginPage(driver);  // initializing variables
		lp.login();
	}
	
	
	
	
	
	
	

}
