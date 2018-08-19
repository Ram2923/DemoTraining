package testcases;

import org.testng.annotations.Test;

import pom.HomePage;

public class CruiseDetails extends BaseClass
{
     @Test
     public void verifyCruiseDetails ()
     {
    	 // Create an object of Home Page in order to click Cruise Link
    	 HomePage homepage = new HomePage(driver);
    	 homepage.clickCruiseLink();
     }
}
