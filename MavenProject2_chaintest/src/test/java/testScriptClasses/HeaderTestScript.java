package testScriptClasses;
import java.io.IOException;

import app_objects.TestometerObjects;
import basePack.BaseClass;
import pageClasses.HeaderPage;
import utility.ExtentReportHelper;

public class HeaderTestScript extends BaseClass
{

	public boolean performLogout() throws IOException
	{
		boolean testResult = false;
		try
		{
			if(TestometerObjects.headerPage().logout() == true)
			{
				System.out.println("Logout is successful");
//				ExtentReportHelper.logPass("Logout is successful");
				testResult = true;
			}
			else
			{
				System.out.println("Logout is failed");
//				ExtentReportHelper.logFail("Logout is failed.");
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found in method 'performLogout' : "+ex.getMessage());
//			ExtentReportHelper.logFail("Exception found in method 'performLogout' :"+ex.getMessage());
			testResult = false;
		}
		return testResult;
	}
	
	

}
