package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class CaptureScreen
{
	/**
	 * Method to take screenshot
	 * @param fileName
	 * @throws IOException
	 */
	public static void printScreen(String fileName, WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver; // typecast driver
		
		String screenShot = screen.getScreenshotAs(OutputType.BASE64); // taking SS and storing in variable
		
		
		
		
		
//		File path = new File("D:\\Trainings\\TESTOMETER\\07_OCT_2024_WEEKDAY_EVE\\Screenshots\\"+fileName+".JPEG"); // decide Path
//		Files.copy(screenShot, path);
	}
	
	
	
	
	
	
	
	
	
}
