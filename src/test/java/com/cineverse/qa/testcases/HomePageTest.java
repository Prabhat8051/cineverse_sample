package com.cineverse.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.GenresPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.LogInPage;
import com.cineverse.qa.pages.MoviesPage;
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
	MoviesPage moviespage;
	
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
	public void ValidateClickonMoviesTest()
	{
		moviespage=homepage.ValidateClickonMovies();
	}
	
	
	@Test(priority=19)
	public void ValidateClickOnGenresTest()
	{
		genrespage= homepage.ValidateClickOnGenres();	
	}
	
	@Test(priority=20)
	public void ValidateClickOnWatchListsTest()
	{
		watchlistspage = homepage.ValidateClickOnWatchLists();
	}
	
	
	@Test(priority=21)
	public void ValidateClickonSearch()
	{
		search= homepage.ValidateClickonSearch();
	}
	
	
	@Test(priority=22)
	public void ValidateClickOnlogInPageTest()
	{
		loginpage= homepage.ValidateClickOnlogInPage();
	}
	
	
	@Test(priority=23)
	public void ValidateDocuramaIsDisplayedTest()
	{
		boolean flag=homepage.ValidateDocuramaIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=24)
	public void ValidateTheFilmDetectiveIsDisplayedTest()
	{
		boolean flag=homepage.ValidateTheFilmDetectiveIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=25)
	public void ValidateConTvIsDisplayedTest()
	{
		boolean flag=homepage.ValidateConTvIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=26)
	public void ValidateSoRealIsDisplayedTest()
	{
		boolean flag=homepage.ValidateSoRealIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=27)
	public void ValidateSoDramaticIsDisplayedTest()
	{
		boolean flag=homepage.ValidateSoDramaticIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=28)
	public void ValidateTheThreeStoogesIsDisplayedTest()
	{
		 boolean flag=homepage.ValidateTheThreeStoogesIsDisplayed();
		 Assert.assertTrue(flag);
	}
	
	
	@Test(priority=29)
	public void ValidateAsianCrushIsDisplayedTest()
	{
		boolean flag = homepage.ValidateAsianCrushIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=30)
	public void ValidateFandorIsDisplayedTest()
	{
		boolean flag = homepage.ValidateFandorIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=31)
	public void ValidateDoveChannelIsDisplayedTest()
	{
		boolean flag = homepage.ValidateDoveChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=32)
	public void ValidateGustoTvIsDisplayedTest()
	{
		boolean flag = homepage.ValidateGustoTvIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=33)
	public void ValidateRetroCrushIsDisplayedTest()
	{
		boolean flag = homepage.ValidateRetroCrushIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	public void ValidateComedyDynamicsIsDisplayed()
	{
		boolean flag = homepage.ValidateComedyDynamicsIsDisplayed();
		Assert.assertTrue(flag);
	}

	
	@Test(priority=34)
	public void ValidateTheElvisPresleyChannelIsDisplayedTest()
	{
		boolean flag=homepage.ValidateTheElvisPresleyChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=35)
	public void ValidateTheBobRossChannelIsDisplayedTest()
	{
		boolean flag = homepage.ValidateTheBobRossChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=36)
	public void ValidateMidNightPulpIsDiplayedTest()
	{
		boolean flag = homepage.ValidateMidNightPulpIsDiplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=37)
	public void ValidateScreamBoxIsDisplayedTest()
	{
		boolean flag = homepage.ValidateScreamBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=38)
	public void ValidateElreyNetworkTest()
	{
	boolean flag=homepage.ValidateElreyNetwork();
	Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=39)
	public void ValidateLoneStarIsDisplayedTest()
	{
		boolean flag = homepage.ValidateLoneStarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
