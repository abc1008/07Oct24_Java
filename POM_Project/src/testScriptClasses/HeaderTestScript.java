package testScriptClasses;


import basePack.BaseClass;
import pageClasses.HeaderPage;
import utility.TestometerObjects;

public class HeaderTestScript extends BaseClass
{

	public boolean performLogout()
	{
		boolean testResult = false;
		try
		{
			if(TestometerObjects.headerPage().logout() == true)
			{
				System.out.println("Logout is successful");
				testResult = true;
			}
			else
			{
				System.out.println("Logout is failed");
			}
		}
		catch (Exception ex) 
		{
			System.out.println("Exception found in method 'performChangePassword' : "+ex.getMessage());
		}
		return testResult;
	}
	
	

}
