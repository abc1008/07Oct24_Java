package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Trainings\\TESTOMETER\\07_OCT_2024_WEEKDAY_EVE\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path);  // let java know about the file
		XSSFWorkbook wb = new XSSFWorkbook(file);   // load/open the file
		XSSFSheet sheet = wb.getSheet("Sheet6");  //open excel sheet
		XSSFRow row = sheet.getRow(1);  // get the row
		XSSFCell cell = row.getCell(1);   // get the cell
		
		String data = cell.getStringCellValue();  // to read numeric data
		
//		double numData = cell.getNumericCellValue();   // to read numeric data
		
		
		
		
		
		System.out.println(data);
	}
	
	
	
	
	
	
	
	
	

}
