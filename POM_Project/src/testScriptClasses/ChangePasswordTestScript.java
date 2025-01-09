package testScriptClasses;

import java.io.IOException;

import basePack.BaseClass;
import utility.TestometerObjects;

public class ChangePasswordTestScript extends BaseClass
{
	
	public void performChangePassword() throws IOException
	{
		
		TestometerObjects.dashboardPage().selectNewVersionFromLeftMenu();
		
		TestometerObjects.changePasswordPage().changePassword();
		
	}
	
	
	
	

}
