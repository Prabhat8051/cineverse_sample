package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.GenresPage;
import com.cineverse.qa.pages.HomePage;

import junit.framework.Assert;


public class GenresPageTest extends CineverseBase {
	HomePage homepage;
	GenresPage genrespage;
	
	public GenresPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		genrespage = new GenresPage();
		homepage=new HomePage();
		genrespage=homepage.ValidateClickOnGenres();
	}
	
	
	@Test(priority=1)
	public void ValidateGenresLeftArrowButtonIsDisplayedTest()
	{
		boolean flag= genrespage.ValidateGenresLeftArrowButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
