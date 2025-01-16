package basePack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testScriptClasses.LoginTestScript;
import utility.ExtentReportHelper;

public class ListenerClass implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		try
		{
			String testCaseName = result.getName();
			ExtentReportHelper.startTest(testCaseName);

			LoginTestScript loginTest = new LoginTestScript();
			loginTest.performLogin();
		} 
		catch (IOException ex)
		{
			try
			{
				ExtentReportHelper.logFail("Exception in onTestStart : " + ex.getMessage());
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure");
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}

}
