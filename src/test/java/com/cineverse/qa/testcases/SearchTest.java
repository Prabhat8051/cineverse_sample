package com.cineverse.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.Search;

public class SearchTest extends CineverseBase {
	
	HomePage homepage;
	Search search;
	
	public SearchTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		search = new Search();
		homepage=new HomePage();
		search=homepage.ValidateClickonSearch();
	}
	
	@Test(priority=1)
	public void ValidateSearchInputBoxIsDisplayedTest()
	{
		boolean flag=search.ValidateSearchInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
