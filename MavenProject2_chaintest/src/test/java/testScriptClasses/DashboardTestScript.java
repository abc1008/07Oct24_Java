package testScriptClasses;

import basePack.BaseClass;
import pageClasses.DashboardPage;

public class DashboardTestScript extends BaseClass
{
	
	public void selectNewVersion()
	{
		DashboardPage dp = new DashboardPage(driver);  // initializing variables
		dp.selectNewVersionFromLeftMenu();
	}

}
