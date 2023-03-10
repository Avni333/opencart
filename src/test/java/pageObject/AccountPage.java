package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

	
	//constructor
	public AccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myacc;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
    WebElement logout;

	
	
	public boolean myacctext()
	{
		try {
	      return (myacc.isDisplayed());	
		}
		catch(Exception e)
		{
			return (false);
		}
	
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	
}


