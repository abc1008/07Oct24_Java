package testScriptClasses;

import java.io.IOException;

import basePack.BaseClass;
import utility.TestometerObjects;

public class ChangePasswordTestScript extends BaseClass
{

	public boolean performChangePassword() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			if (TestometerObjects.dashboardPage().selectNewVersionFromLeftMenu() == true)
			{
				if (TestometerObjects.changePasswordPage().changePassword() == true)
				{
					System.out.println("Password is updated successfully.");
					testResult = true;
				} 
				else
				{
					System.out.println("Failed to update password.");
				}
			} 
			else
			{
				System.out.println("Failed to click on New Version button.");
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found in method 'performChangePassword' : "+ex.getMessage());
			testResult = false;
		}


		return testResult;
	}

}
