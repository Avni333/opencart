package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegister extends BasePage {
	
	public AccountRegister(WebDriver driver)
	{
		super(driver);
		
	}
  
	
	//Elements
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirm;
	
	//Action methods
	
	public void setFirstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	public void clickAgree()
	{
		agree.click();
	}
	
	public void clickContinue()
	{
		//btncontinue.click();
		Actions act=new Actions(driver);
		act.moveToElement(btncontinue).click().perform();
		
	}
	
	public String getConfirmation()
	{
		try 
		{
			return (confirm.getText()); //if unsuccessful to register ,unable to find expected text ,put in try to handle exception
		} catch(Exception e){
			return(e.getMessage());
		}
		
	}
	
	
}
