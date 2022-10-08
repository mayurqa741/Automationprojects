package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver,int testId) throws IOException
	{
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		String stamp = d.toString().replace(" ","").replace(":", "");
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\MAYUR PATIL\\Desktop\\SS\\test-"+testId +stamp + ".jpg");
		FileHandler.copy(f, f1);
	}
	
	public static String takeExcelData (String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{	
		try
		{
			FileInputStream f = new FileInputStream("C:\\Users\\MAYUR PATIL\\Desktop\\testing.xlsx");
			String data =WorkbookFactory.create(f).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			System.out.println(data);
			return data;
		}
		catch(Exception i)
		{
			FileInputStream f = new FileInputStream("C:\\Users\\MAYUR PATIL\\Desktop\\testing.xlsx");
			double d = WorkbookFactory.create(f).getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
			String data = Double.toString(d);
			System.out.println(data);
			return data;
		}
	
	}


}
