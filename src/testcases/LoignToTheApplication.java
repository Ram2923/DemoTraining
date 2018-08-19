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

/* Test case name: Login with valid credentials
Test Data : Will be provided from Excel Sheet
Expected result: System should allow user to login
Author name: Ram
Dated: 26-06-2018 
Modified By:
Modified Date: 
Modification:
*/

public class LoignToTheApplication extends BaseClass // As BaseClass will launch the browser and close the browser after all the steps of test cases are executed
{
	// This @Test Method will execute the complete test case when it is invoked	
	
	@Test
	public void login () throws EncryptedDocumentException, InvalidFormatException, IOException
	{	
		// Create an object of Home Page in order to login to the application
		HomePage homepage = new HomePage (driver);
		
		/*Get the test data from Excel sheet, by invoking the Method written in ReadDataFromExcelSheet class and
		 Set the Path of Test Data Sheet, and set the SheetName into String variable named - Path and SheetName respectively*/
		
		String path = "./TestData/TestData.xlsx";
		String Sheetname = "LoginCredintials";
		
		String username = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 0);
		String password = ReadTestDataFromExcelSheet.readDataFromExcel(path, Sheetname, 1, 1);
		
		// Pass the username and password data, which has been captured from Excel Sheet
		
		homepage.login(username, password);
		
		
		// Validate for Successful login		
		WebElement webelement = driver.findElement(By.xpath("//input[@value='Login']"));
		Assert.assertTrue(webelement.isDisplayed());		
		System.out.println("Login Successful !!!! ");
		
		
	}

}
