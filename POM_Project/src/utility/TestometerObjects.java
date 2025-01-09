package utility;

import basePack.BaseClass;
import pageClasses.ChangePasswordPage;
import pageClasses.DashboardPage;

public class TestometerObjects extends BaseClass
{
	private static ChangePasswordPage _changePasswordPage;
	public static ChangePasswordPage changePasswordPage()
	{
		_changePasswordPage = new ChangePasswordPage(driver);
		return _changePasswordPage;
	}
	
	
	private static DashboardPage _dashboardPage;
	public static DashboardPage dashboardPage()
	{
		_dashboardPage = new DashboardPage(driver);
		return _dashboardPage;
	}
	
	
	
	

}
