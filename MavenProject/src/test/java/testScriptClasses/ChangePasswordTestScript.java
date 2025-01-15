package testScriptClasses;

import java.io.IOException;

import app_objects.TestometerObjects;
import basePack.BaseClass;
import utility.ExtentReportHelper;

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
//					System.out.println("Password is updated successfully.");
					ExtentReportHelper.logPass("Password is updated successfully.");
					testResult = true;
				} 
				else
				{
//					System.out.println("Failed to update password.");
					ExtentReportHelper.logFail("Failed to update password.");
				}
			} 
			else
			{
//				System.out.println("Failed to click on New Version button.");
				ExtentReportHelper.logFail("Failed to click on New Version button.");
			}
		}
		catch (Exception ex) 
		{
//			System.out.println("Exception found in method 'performChangePassword' : "+ex.getMessage());
			ExtentReportHelper.logFail("Exception found in method 'performChangePassword' :"+ex.getMessage());
			testResult = false;
		}
		return testResult;
	}

}
