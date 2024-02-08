package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;

import junit.framework.Assert;

public class LiveTvPageTest extends CineverseBase {
	
	LiveTvPage livetvpage;
	HomePage homepage;
	
	public LiveTvPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		livetvpage = new LiveTvPage();
		homepage=new HomePage();
		livetvpage=homepage.ValidateClickOnLiveTv();
	}
	
	@Test(priority=1)
	public void ValidateLiveTextIsDisplayedTest()
	{
		 boolean flag=livetvpage.ValidateLiveTextIsDisplayed();
		 Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
