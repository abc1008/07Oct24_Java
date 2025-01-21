package utility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver;
	
	public ExtentReportHelper(String dateTime, WebDriver driver)
	{
		this.driver = driver;
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
	
	public static void logFail(String message) throws IOException
	{
		Media screen = printScreen("TestScreenshot", driver);
		test.log(Status.FAIL, message, screen);
	}
	
	public static void logInfo(String message)
	{
		test.log(Status.INFO, message);
	}

	public static void endTest()
	{
		extent.flush();
	}
	
	
	/**
	 * Method to take screenshot
	 * @param fileName
	 * @throws IOException
	 */
	public static Media printScreen(String fileName, WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver; // typecast driver
		String screenShot = screen.getScreenshotAs(OutputType.BASE64); // taking SS and storing in variable
		MediaEntityBuilder mediaEntityBuilder = MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot);
		
		return mediaEntityBuilder.build();
	}


}
