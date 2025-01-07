package testScriptClasses;

import basePack.BaseClass;
import pageClasses.LoginPage;
import testSuits.LoginTestSuite;

public class LoginTestScript extends BaseClass
{
	
	public void performLogin()
	{
		LoginPage lp = new LoginPage(driver);  // initializing variables
		lp.login();
	}
	
	
	
	
	
	
	

}
