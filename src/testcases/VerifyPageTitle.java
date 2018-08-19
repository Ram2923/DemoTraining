package testcases;

import org.testng.annotations.Test;


/* Test case name: To validate the Page title of Home page
Test Data : NA
Expected result: System should validate the page title and compare it with expected result
Author name: Ram
Dated: 26-06-2018 
Modified By:
Modified Date: 
Modification:
*/
public class VerifyPageTitle extends BaseClass //@BeforeClass method of BaseClass will launch the browser, and enter the URL
{
	// This @Test Method will execute the complete test case when it is invoked	
    @Test
    public void verifyPageTitle ()
    {
    	// We are storing the expected title of the Home Page into as String variable named: expectedTitle
    	String expectedTitle = "Welcome: Mercury Tours";
    	
    	// Here the selenium tool will get the title of Home page and the same title is stored in a String variable named: actualtitle
    	String actualtitle = driver.getTitle();
    	
    	// Here we are using conditional statement (if) to compare the Actual and Expected title
    	if (actualtitle.equals(expectedTitle))
    	{
    		System.out.println("Tile Verified and hence Test Pass!!");
    	}
    	
    	else
    	{
    		System.out.println("Title not matched and hence Fail !!");
    	}
    }
}
