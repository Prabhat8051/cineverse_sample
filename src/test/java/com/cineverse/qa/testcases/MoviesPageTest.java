package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.MoviesPage;

import junit.framework.Assert;

public class MoviesPageTest extends CineverseBase {

	MoviesPage moviespage;
	HomePage homepage;
	
	
	public MoviesPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		moviespage= new MoviesPage();
		homepage=new HomePage();
		moviespage=homepage.ValidateClickonMovies();
	}
	
	
	@Test(priority=1)
	public void ValidatePromoTitleIsDisplayedTest()
	{
		boolean flag=moviespage.ValidatePromoTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
