package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.LogInPage;

import junit.framework.Assert;

public class LogInPageTest extends CineverseBase{
	
	LogInPage loginpage;
	HomePage homepage;
	
	 public LogInPageTest()
	 {
		 super();
	 }
	
	 
	 @BeforeMethod
		public void setup() throws InterruptedException
		{
			initialization();
			loginpage = new LogInPage();
			homepage=new HomePage();
			loginpage = homepage.ValidateClickOnlogInPage();
		}
	 
	@Test(priority=1)
	public void ValidateLoginButtonIsDisplayedTest()
	{
		boolean flag=homepage.ValidateLoginIsDisplayed();
		Assert.assertTrue(flag);
	}
	 
	 
	 @AfterMethod
		public void teardown()
		{
			driver.quit();
		}
	 
	 
	 

}
