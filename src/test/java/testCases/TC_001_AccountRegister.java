package testCases;


import org.testng.annotations.Test;
import org.testng.Assert;

import pageObject.AccountRegister;
import pageObject.HomePage;
import pageObject.successPage;
import testBase.BaseClass;

public class TC_001_AccountRegister extends BaseClass{


	@Test
	void test_account_register() throws InterruptedException 
	{
		
		
		logger.info("Starting TC_001_AccountRegister");
		    //if any of data is invalid ,it will get failed so used try for any exception
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyacc();
		logger.info("Clicked on My account link");
		Thread.sleep(2000);
		hp.clickRegister();
		logger.info("Clicked on Register link");
		
		AccountRegister reg=new AccountRegister(driver);
		logger.info("Providing customer data");
		
		//reg.setFirstName("abc");  it is static, same name can be again 
		reg.setFirstName(randomeString().toUpperCase()); //Dynamic inputs , name in Uppercase
	
		//reg.setLastName("xyz");
		reg.setLastName(randomeString().toUpperCase());
		
		//reg.setEmail("abcxyz@gmail.com"); //repeating same email willl trow error as it should be dynamic
		reg.setEmail(randomeString()+"@gmail.com");
		
		
		//for password and confirm password ,generated data should be same
		
		String pswd=randomeAlphaNumeric();
		//reg.setPassword("test@123");
		reg.setPassword(pswd);
		reg.clickAgree();
		reg.clickContinue();
		logger.info("Clicked on Continue Button");
		
		//String msg=reg.getConfirmation();
		//Assert.assertEquals(msg, "Your Account Has Been Created!");
		
		successPage sp=new successPage(driver);
		String msg=sp.messsage();
		String exp="Your Account Has Been Created!" ;
		
		logger.info("Validating exepected output");
		Assert.assertEquals(msg,exp,"Test Failed in Assert");
		} catch(Exception e)
		{
			logger.error("Test failed");
			Assert.fail();
		}
		logger.info("Finished login Test");
		
	}
	
}
