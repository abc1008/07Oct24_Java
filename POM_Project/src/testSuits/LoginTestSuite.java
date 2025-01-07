package testSuits;

import org.testng.annotations.Test;

import testScriptClasses.LoginTestScript;

public class LoginTestSuite
{

	@Test
	public void tc123_LoginTest()
	{
		LoginTestScript loginTest = new LoginTestScript();
		loginTest.performLogin();
	}
	
	
	

}
