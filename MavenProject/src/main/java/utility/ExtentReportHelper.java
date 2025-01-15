package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	static ExtentReports extent;
	static ExtentTest test;
	
	public ExtentReportHelper(String dateTime)
	{
		String projectPath = System.getProperty("user.dir");
		String reportPath = projectPath + "\\TestResult\\testReport"+dateTime+".html";
		extent = new ExtentReports(); // main class of report
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
		extent.attachReporter(extentSparkReporter);
	}
	
	public static void startTest(String testCaseName)
	{
		 test = extent.createTest(testCaseName);
	}
	
	public static void logPass(String message)
	{
		test.log(Status.PASS, message);
	}
	
	public static void logFail(String message)
	{
		test.log(Status.FAIL, message);
	}
	
	public static void logInfo(String message)
	{
		test.log(Status.INFO, message);
	}

	public static void endTest()
	{
		extent.flush();
	}


}
