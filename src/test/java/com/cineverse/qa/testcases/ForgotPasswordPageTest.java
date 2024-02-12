package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.ForgotPasswordPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.LogInPage;

import junit.framework.Assert;

public class ForgotPasswordPageTest extends CineverseBase {
	ForgotPasswordPage forgotpasswordpage;
	HomePage homepage;
	LogInPage loginpage;
	
	public ForgotPasswordPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		forgotpasswordpage = new ForgotPasswordPage();
		homepage= new HomePage();
		homepage.ValidateClickOnlogInPage();
		loginpage = new LogInPage();
		loginpage = homepage.ValidateClickOnlogInPage();
		forgotpasswordpage= loginpage.ValidateClickOnForgotPassword();
	}
	
	
	
	@Test(priority=1)
	public void ValidatePleaseEnterTextTest()
	{
		String txt=forgotpasswordpage.ValidatePleaseEnterText();
		Assert.assertEquals(txt, "Please enter your registered Email ID");
	}
	
	
	@Test(priority=2)
	public void ValidateEmailInputFieldIsDisplayedText()
	{
		boolean flag=forgotpasswordpage.ValidateEmailInputFieldIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@Test(priority=3)
	public void ValidateSubmitButtonIsDisplayedTest()
	{
		boolean flag=forgotpasswordpage.ValidateSubmitButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
