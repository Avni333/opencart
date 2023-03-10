package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class successPage extends BasePage {

	
	public successPage(WebDriver driver)
	{
		super(driver);
	}
	
	//elements
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement created;
	
	
	//Action method
	
	public String messsage()
	
	{
		return (created.getText());
	}
}
