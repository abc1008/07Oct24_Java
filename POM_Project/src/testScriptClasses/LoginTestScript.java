package testScriptClasses;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.LoginPage;

public class LoginTestScript extends BaseClass
{
	
	public void performLogin() throws IOException
	{
		LoginPage lp = new LoginPage(driver);  // initializing variables
		lp.login();
	}
	
	
	
	
	
	
	

}
