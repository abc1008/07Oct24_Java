package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import pack1.Login;

public class CaptureScreen
{
	
	/**
	 * Method to take screenshot
	 * @param fileName
	 * @throws IOException
	 */
	public static void printScreen(String fileName) throws IOException
	{
		
		TakesScreenshot screen = (TakesScreenshot)Login.driver; // typecast driver
		File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking SS and storing in variable
		File path = new File("D:\\Trainings\\TESTOMETER\\07_OCT_2024_WEEKDAY_EVE\\Screenshots\\"+fileName+".JPEG"); // decide Path
		Files.copy(screenShot, path);
	}
	
	
	
	
	
	
	
	
	
}
