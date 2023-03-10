package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	
	
	@Test
	public void test_Login()
	{   
		
		logger.info("Starting TC_002_LoginTest");
		
		try
		{//Homepage
		HomePage hp=new HomePage(driver);
		hp.clickMyacc();
		logger.info("Clicked on my account");
		hp.clickLogin();
		logger.info("Clicked on Login");
		//Loginpage
		LoginPage lp=new LoginPage(driver);
		
		//use from config properties
		lp.enteremail(rb.getString("email"));
		logger.info("Provided mail");
		lp.enterPassword(rb.getString("password"));
		logger.info("Provided Password");
		lp.clciksubmit();
		logger.info("Clicked on Submit button");
		
		//AccountPage
		AccountPage ap=new AccountPage(driver);
		boolean num= ap.myacctext();
		AssertJUnit.assertEquals(num, true);
		
	}
		catch(Exception e)
		{
			logger.error("Test got failed");
			AssertJUnit.fail();
		}
		
		logger.info(" Finished TC_002_LoginTest");
}
}