package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.GenresPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.LogInPage;
import com.cineverse.qa.pages.Search;
import com.cineverse.qa.pages.WatchlistsPage;

import junit.framework.Assert;

public class HomePageTest extends CineverseBase {
	HomePage homepage;
	LiveTvPage livetvpage;
	LogInPage loginpage;
	GenresPage genrespage;
	Search search;
	WatchlistsPage watchlistspage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void ValidateCineverseLogoIsDisplayedTest()
	{
		boolean flag=homepage.ValidateCineverseLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test (priority=2)
	public void ValidateLiveTvIsDisplayedTest()
	{
		boolean flag=homepage.ValidateLiveTvIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateMoviesIsDisplayedTest()
	{
		boolean flag=homepage.ValidateMoviesIsDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=4)
	public void ValidateShowsIsDisplayedTest()
	{
		boolean flag = homepage.ValidateShowsIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateGenresIsDisplayedTest()
	{
		boolean flag= homepage.ValidateGenresIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateWatchListsIsDisplayedTest()
	{
		boolean flag = homepage.ValidateWatchListsIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateSearchIsDisplayedTest()
	{
		boolean flag = homepage.ValidateSearchIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=8)
	public void ValidateLoginIsDisplayedTest()
	{
		boolean flag = homepage.ValidateLoginIsDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=9)
	public void ValidatePromoTitleIsDisplayedTest()
	{
		boolean flag=homepage.ValidatePromoTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=10)
	public void ValidatePromoBannerTextTest()
	{
		boolean flag=homepage.ValidatePromoBannerText();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidatePromoSubscribeButtonIsDisplayedTest()
	{
		 boolean flag=homepage.ValidatePromoSubscribeButtonIsDisplayed();
		 Assert.assertTrue(flag);
	}
	
	
	@Test(priority=12)
	public void ValidatePromoInfoButtonIsDisplayedTest()
	{
		boolean flag=homepage.ValidatePromoInfoButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13)
	public void ValidateActionShelfTrilaerTextIsDisplayedTest()
	{
		boolean flag=homepage.ValidateActionShelfTrilaerTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void VaildateActionShelfWatchTrailerButtonIsDisplayedTest()
	{
		boolean flag = homepage.VaildateActionShelfWatchTrailerButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=15)
	public void ValidateChannelLeftSwipeButtonIsDisplayedTest()
	{
		boolean flag=homepage.ValidateChannelLeftSwipeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=16)
	public void ValidateChannelRightSwipeButtonIsDisplayedTest()
	{
		boolean flag= homepage.ValidateChannelRightSwipeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateClickOnLiveTvTest()
	{
		livetvpage=homepage.ValidateClickOnLiveTv();
	}
	
	@Test(priority=18)
	public void ValidateClickOnGenresTest()
	{
		genrespage= homepage.ValidateClickOnGenres();	
	}
	
	@Test(priority=19)
	public void ValidateClickOnWatchListsTest()
	{
		watchlistspage = homepage.ValidateClickOnWatchLists();
	}
	
	
	@Test(priority=20)
	public void ValidateClickonSearch()
	{
		search= homepage.ValidateClickonSearch();
	}
	
	
	@Test(priority=21)
	public void ValidateClickOnlogInPageTest()
	{
		loginpage= homepage.ValidateClickOnlogInPage();
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
