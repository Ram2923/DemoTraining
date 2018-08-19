package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

public class BaseClass 
{	
	WebDriver driver;	
	
    // This method will launch the Chrome browser, enters the url and navigate to Home Page of the application	
	@BeforeClass
	public void launchChromeBrowser () 
	{	
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver ();		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com/");
				
		
	}
	
	// This method will Close the Chrome browser after all the test steps are executed
	@AfterMethod
	public void closeBrowser ()
	{	
		driver.close();
		
		
		
	}
	
	
	
	
	

	

}
