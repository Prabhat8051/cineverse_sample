package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.WatchlistsPage;

import junit.framework.Assert;

public class WatchlistsPageTest extends CineverseBase{

	HomePage homepage;
	WatchlistsPage watchlistspage;
	
	
	public WatchlistsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		watchlistspage = new WatchlistsPage();
		homepage=new HomePage();
		watchlistspage= homepage.ValidateClickOnWatchLists();
		
	}
	
	@Test(priority=1)
	public void ValidateLogInSignUpTextisDisplayedTest()
	{
		boolean flag=watchlistspage.ValidateLogInSignUpTextisDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
