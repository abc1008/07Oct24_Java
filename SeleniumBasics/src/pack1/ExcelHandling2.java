package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling2
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Trainings\\TESTOMETER\\07_OCT_2024_WEEKDAY_EVE\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path);  // let java know about the file
		XSSFWorkbook wb = new XSSFWorkbook(file);   // load/open the file
		XSSFSheet sheet = wb.getSheet("Sheet6");  //open excel sheet
		
		XSSFRow createdRow = sheet.createRow(5);
		XSSFCell createdCell = createdRow.createCell(2);
		
//		XSSFRow row = sheet.getRow(4);  // get the row
//		XSSFCell cell = row.getCell(1);   // get the cell
		
		
		// To write the data into excel
		FileOutputStream fout = new FileOutputStream(path);
		createdCell.setCellValue("Udpated Created Cell Value");   // writiting the data in excel
		wb.write(fout);  // save the updated workbook
		
		System.out.println("Completed");
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	

}
