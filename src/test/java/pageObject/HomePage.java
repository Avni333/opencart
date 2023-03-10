package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	// ***** Page Object Class  
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);  //parent constructor invoking
	}

	
	//Elements
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myacc;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")
	WebElement register;
	
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	//Action methods
	
	public void clickMyacc()
	{
		myacc.click();
	}
	
	public void clickRegister()
	{
		register.click();
	
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
