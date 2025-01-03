package testPack1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart : "+ result.getName());
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
