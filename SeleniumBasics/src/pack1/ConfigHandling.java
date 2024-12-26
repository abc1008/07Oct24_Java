package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigHandling
{

	
	public static void main(String[] args) throws IOException
	{
		
		String projectPath = System.getProperty("user.dir");  // method to get project path till project folder
		String filePath = projectPath + "\\config.properties";
		
		FileInputStream file = new FileInputStream(filePath); // letting java know about file path
		
		Properties prop = new Properties();  		// object creation
		prop.load(file);  							// open or load the file
		String data = prop.getProperty("User");  // get the proprty
		
		System.out.println(data);
		
		
		
	}
	
	
	
	
	
}
