package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonOps
{
	
	public static String readConfig(String propertyName) throws IOException
	{
		String projectPath = System.getProperty("user.dir");  // method to get project path till project folder
		String filePath = projectPath + "\\config.properties";
		FileInputStream file = new FileInputStream(filePath); // letting java know about file path
		
		Properties prop = new Properties();  		// object creation
		prop.load(file);  							// open or load the file
		String propertyValue = prop.getProperty(propertyName);  // get the proprty
		
		
		return propertyValue;
	}

}
