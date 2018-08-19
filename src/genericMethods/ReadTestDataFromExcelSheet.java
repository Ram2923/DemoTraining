package genericMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTestDataFromExcelSheet 
{
	
	
	public static String readDataFromExcel (String path, String sheetname, int row, int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String value = "";
		
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		
		return value;
		
	}
	

}
