package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPage 
{
	// Declaring the web elements of HomePage, by using @FindBy annotation
	@FindBy (xpath = "//a[text()='Flights']")
	private WebElement FlightsLink;
	
	// Initializing the Web elements of the page using PageFactory.initElements methods	
	public RegistrationConfirmationPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Developing methods in order to perform specific actions on browser
	public void clickFlightsLink ()
	{
		FlightsLink.click();
	}
	
}
