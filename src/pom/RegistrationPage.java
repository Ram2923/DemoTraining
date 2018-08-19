package pom;

import org.apache.james.mime4j.field.address.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*class name: Registration Page 
Author: Ram
date: 26-06-2018
Purpose: In this class, we are declaring, initializing the web elements present on Registration Page and developing the methods, 
that serve specific actions */

public class RegistrationPage 
{
	 // Declaring the web elements of Registration Page, by using @FindBy annotation
	 @FindBy (xpath = "//input[@name='firstName']")
	 private WebElement FirstNameField;
	 
	 @FindBy (xpath = "//input[@name='lastName']")
	 private WebElement LastNameField;
	 
	 @FindBy (xpath = "//input[@name='phone']")
	 private WebElement PhoneField;
	 
	 @FindBy (xpath = "//input[@name='userName']")
	 private WebElement UserNameFiled;
	 
	 @FindBy (xpath = "//input[@name='address1']")
	 private WebElement AddressField;
	 
	 @FindBy (xpath = "//input[@name='city']")
	 private WebElement CityField;
	 
	 @FindBy (xpath = "//input[@name='state']")
	 private WebElement StateField;
	 
	 @FindBy (xpath = "//input[@name='postalCode']")
	 private WebElement PostCodeField;
	 
	 @FindBy (xpath = "//input[@name='email']")
	 private WebElement EmailFiled;
	 
	 @FindBy (xpath = "//input[@name='password']")
	 private WebElement PasswordField;
	 
	 @FindBy (xpath = "//input[@name='confirmPassword']")
	 private WebElement ConfirmPasswordField;
	 
	 @FindBy (xpath = "//input[@name='register']")
	 private WebElement SubmitButton;
	 
	// Initializing the Web elements of the page using PageFactory.initElements methods	
		public RegistrationPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	// Developing methods in order to perform specific actions on browser
	   public void registerUser (String firstname, String lastname, String phone, String username, String address, String city, String state,
			                     String postcode, String email, String password, String confirmpassword)
	   {
		   FirstNameField.sendKeys(firstname);
		   LastNameField.sendKeys(lastname);
		   PhoneField.sendKeys(phone);
		   UserNameFiled.sendKeys(username);
		   AddressField.sendKeys(address);
		   CityField.sendKeys(city);
		   StateField.sendKeys(state);
		   PostCodeField.sendKeys(postcode);
		   EmailFiled.sendKeys(email);
		   PasswordField.sendKeys(password);
		   ConfirmPasswordField.sendKeys(confirmpassword);
		   SubmitButton.click();
	   }
		
		
}



























