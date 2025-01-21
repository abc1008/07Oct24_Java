package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import app_objects.TestometerObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageClasses.HeaderPage;
import pageClasses.LoginPage;
import utility.CommonOps;
import utility.ExtentReportHelper;

public class BaseClass
{
	public static WebDriver driver;

	public static void launchBrowserAndLogin() throws IOException
	{
		 LocalDateTime time = LocalDateTime.now();
		 DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss");  // _15012025_07_52_35
		 String dateTimeStamp = "_" + time.format(dateTimeFormat);
		 String browserName = CommonOps.readConfig("Browser");
		 
		 if(browserName.equals("CHROME"))
			 driver = new ChromeDriver();
		 else if(browserName.equals("EDGE"))
			 driver = new EdgeDriver();
		 else
			 System.out.println("Browser Name is incorrect.");
		
		driver.manage().window().maximize();
		
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(dateTimeStamp, driver);
		driver.get(CommonOps.readConfig("TestSiteURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ExtentReportHelper.startTest("TestName");
		LoginPage lp = new LoginPage(driver);
		lp.login();
		
		TestometerObjects.dashboardPage().selectNewVersionFromLeftMenu();
	}

	

	public static void logout() throws IOException
	{
		HeaderPage hp = new HeaderPage(driver);
		hp.logout();
		ExtentReportHelper.endTest();
		driver.quit();
	}
	

}
