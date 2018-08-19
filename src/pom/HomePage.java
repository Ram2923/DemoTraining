package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.LocatorsFromPropertyFile;
import mx4j.tools.config.DefaultConfigurationBuilder.Register;

/* Test case name: Login with valid credentials
Test Data : Will be provided from Excel Sheet
Expected result: System should allow user to login
Author name: Ram
Dated: 26-06-2018 
Modified By:
Modified Date: 
Modification:
*/
public class HomePage 
{	
	
    // Declaring the web elements of HomePage, by using @FindBy annotation	
	@FindBy (xpath = "//input[@name='userName']")
	private WebElement UserNameField;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement PasswordField;
	
	@FindBy (xpath = "//input[@name='login']")
	private WebElement LoginButton;
	
	@FindBy (xpath = "//a[text()='REGISTER']")
	private WebElement RegisterLink;
	
	@FindBy (xpath = "//a[text()='Flights']")
	private WebElement FlightsLink;
	
	@FindBy (xpath = "//a[text='Cruises']")
	private WebElement CruiseLink;
	
	// Initializing the Web elements of the page using PageFactory.initElements methods	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Developing methods in order to perform specific actions on browser
	public void login (String username, String password)
	{
		UserNameField.sendKeys(username);
		PasswordField.sendKeys(password);
	    LoginButton.click();
		
	}
	
	// This method will click Register link on Home page upon called
	public void clickRegisterLink ()
	{
		RegisterLink.click();
	}
	
	// This method will click Flights link on Home page upon called
	public void clickFlightsLink ()
	{
		FlightsLink.click();
	}
	
	// This method will click Cruise link on Home page upon called
	public void clickCruiseLink ()
	{
		CruiseLink.click();
	}
}
