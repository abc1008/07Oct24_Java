package testSuits;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import basePack.BaseClass;
import testScriptClasses.ChangePasswordTestScript;

public class ChangePasswordTestSuite extends BaseClass
{
	
	@Test
	public void TC123_ChangePasswordTest() throws IOException
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword(), "TC123_ChangePasswordTest - Test Case failed.");
	}
	

}
