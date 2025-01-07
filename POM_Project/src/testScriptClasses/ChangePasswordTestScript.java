package testScriptClasses;

import basePack.BaseClass;
import pageClasses.ChangePasswordPage;
import pageClasses.DashboardPage;

public class ChangePasswordTestScript extends BaseClass
{
	
	public void performChangePassword()
	{
		DashboardPage dp = new DashboardPage(driver);  // initializing variables
		dp.selectNewVersionFromLeftMenu();
		
		
		ChangePasswordPage cp = new ChangePasswordPage(driver);
		cp.changePassword();
	}
	
	
	
	

}
