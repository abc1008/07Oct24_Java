package testSuits;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;

import basePack.BaseClass;
import testScriptClasses.ChangePasswordTestScript;

//@Listeners(ChainTestListener.class)
public class ChangePasswordTestSuite extends BaseClass
{
	
	@Test
	public void TC123_ChangePasswordTest() throws IOException
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword(), "TC123_ChangePasswordTest - Test Case failed.");
	}
	

}
