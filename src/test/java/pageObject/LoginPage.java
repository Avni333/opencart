package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    
	//constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement paswd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement submit;
	
	//Action methods
	public void enteremail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pwd)
	{
		paswd.sendKeys(pwd);
	}
	
	public void clciksubmit()
	{
		submit.click();
	}
	
	
	
}
