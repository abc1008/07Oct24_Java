package testScriptClasses;


import basePack.BaseClass;
import pageClasses.HeaderPage;

public class HeaderTestScript extends BaseClass
{
	
	public void performLogout()
	{
		HeaderPage hp = new HeaderPage(driver);  // initializing variables
		hp.logout();
	}
	
	

}
