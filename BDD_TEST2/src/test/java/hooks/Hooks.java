package hooks;

import java.io.IOException;

import basePack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void testSetup() throws IOException
	{
		BaseClass.launchBrowserAndLogin();
	}
	
	
	@After
	public void tearDdown() throws IOException
	{
		BaseClass.logout();
	}

}
