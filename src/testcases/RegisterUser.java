package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericMethods.ReadTestDataFromExcelSheet;
import pom.HomePage;
import pom.RegistrationPage;

/* Test case name: Register the User
Test Data : Will be provided from Excel Sheet
Expected result: System should allow user to Register Successfully with confirmation message
Author name: Ram
Dated: 26-06-2018 
Modified By:
Modified Date:
Modification:
*/

public class RegisterUser extends BaseClass
{
	
	// This method will create a new profile
	@Test
	public void registerUser () throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		// Create an object of Home Page in order to click "Register" link
		HomePage homepage = new HomePage (driver);
		homepage.clickRegisterLink();
		
		
		/*Get the test data from Excel sheet, by invoking the Method written in ReadDataFromExcelSheet class and
		 Set the Path of Test Data Sheet, and set the SheetName into String variable named - Path and SheetName respectively*/
		
		String path = "./TestData/TestData.xlsx";
		String Sheetname = "RegisterData";
		
		String firstname = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 0);
		String lastname = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 1);
		String email = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 2);
		String address = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 3);
		String city = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 4);
		String state = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 5);
		String postcode = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 6);
		String username = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 7);
		String password = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 8);
		String cpassword = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 8);
		
		// Pass the username and password data, which has been captured from Excel Sheet
		
		RegistrationPage register = new RegistrationPage(driver);
		register.registerUser(firstname, lastname, "9877876765", email, address, city, state, postcode, username, password, cpassword);	
		
		
		WebElement we = driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']"));
		if (we.isDisplayed())
		{
			System.out.println("Registration !! change");
			
		}
		
		
		
		// 
	}

}
