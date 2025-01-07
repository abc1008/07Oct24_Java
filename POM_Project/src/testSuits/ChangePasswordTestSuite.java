package testSuits;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScriptClasses.ChangePasswordTestScript;

public class ChangePasswordTestSuite
{
	
	@Test
	public void TC123_ChangePasswordTest()
	{
		ChangePasswordTestScript cp = new ChangePasswordTestScript();
		cp.performChangePassword();
	}
	

}
