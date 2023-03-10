package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_OO3_LoginDDT extends BaseClass{
   
	
	@Test(dataProvider="LoginData" , dataProviderClass= DataProviders.class)
	public void logintest(String email,String pwd, String exp)
	{
		
		logger.info("Starting of  TC_OO3_LoginDDT");
		
	   try
	     {
		HomePage hp=new HomePage(driver);
		hp.clickMyacc();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.enteremail(email);
		lp.enterPassword(pwd);
		lp.clciksubmit();
		
		AccountPage ap=new AccountPage(driver);  
		boolean text= ap.myacctext();
		
		if(exp.equals("Valid"))
		{
			
			if(text == true)
			{
				ap.clickLogout();
				Assert.assertTrue(true);
				
			}
			
			else
			{
				Assert.assertTrue(false);
				
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(text == true)
			{
				AccountPage apage=new AccountPage(driver);
				apage.clickLogout();
				Assert.assertTrue(false);
			}
			
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	   catch(Exception e)
	   {
		   Assert.fail();   }
		
	   logger.info("Finished TC_OO3_LoginDDT");
		
	}
	
	
}
