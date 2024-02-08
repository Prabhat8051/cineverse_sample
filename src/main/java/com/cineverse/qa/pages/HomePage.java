package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class HomePage extends CineverseBase {
	
	
	//Object Repository 
	@FindBy(xpath="//img[@alt='Cineverse Logo ']")
	WebElement cineverselogo;
	
	
	@FindBy(xpath="//span[text()='Live TV']")
	WebElement livetv;
	
	@FindBy(xpath="//span[text()='Movies']")
	WebElement movies;
	
	@FindBy(xpath="//span[text()='Shows']")
	WebElement shows;
	
	@FindBy(xpath="//span[text()='Genres']")
	WebElement genres;
	
	@FindBy(xpath="//span[text()='Watchlists']")
	WebElement watchlists;
	
	@FindBy(xpath="//span[text()='Search']")
	WebElement search;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//img[@alt='Promo Title Image']")
	WebElement pomotitle;
	
	@FindBy(xpath="//div[@class='banner-txt']")
	WebElement promobannertext;
	
	@FindBy(xpath="//button[@class='sc-99d55f29-0 eKuihn subscribetoplay']")
	WebElement promosubscribebutton;
	
	@FindBy(xpath="//button[@class='sc-b708dbb-0 kfdOtU play more-info']")
	WebElement promoinfobutton;
	
	@FindBy(xpath="//div[@class='costom-desc baby']")
	WebElement actionshelftrailertext;
	
	
	@FindBy(xpath="")
	WebElement actionshelfwatchtrailerbutton;
	
	@FindBy(xpath="//div[@class='swiper-button-prev']")
	WebElement channelleftswipebutton;
	
	
	@FindBy(xpath="//div[@class='swiper-button-next']")
	WebElement channelrightswipetbutton;
	
	
	
	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean ValidateCineverseLogoIsDisplayed()
	{
		return cineverselogo.isDisplayed();
	}
	
	
	
	
	public  boolean ValidateLiveTvIsDisplayed()
	{
		return livetv.isDisplayed();
	}
	
	
	public boolean ValidateMoviesIsDisplayed()
	{
		return movies.isDisplayed();
	}

	
	public boolean ValidateShowsIsDisplayed()
	{
		return shows.isDisplayed();
	}
	
	
	public boolean ValidateGenresIsDisplayed()
	{
		return genres.isDisplayed();
	}
	
	
	public boolean ValidateWatchListsIsDisplayed()
	{
		return watchlists.isDisplayed();
	}
	
	
	public boolean ValidateSearchIsDisplayed()
	{
		return search.isDisplayed();
	}
	
	
	public boolean ValidateLoginIsDisplayed()
	{
		return login.isDisplayed();
	}
	
	
	
	public boolean ValidatePromoTitleIsDisplayed()
	{
		return pomotitle.isDisplayed();
	}
	
	
	public boolean ValidatePromoBannerText()
	{
		return promobannertext.isDisplayed();
	}
	
	
	public boolean ValidatePromoSubscribeButtonIsDisplayed()
	{
		return promosubscribebutton.isDisplayed();
	}
	
	
	public boolean ValidatePromoInfoButtonIsDisplayed()
	{
		return promoinfobutton.isDisplayed();
	}
	
	
	public String ValidateTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean ValidateActionShelfTrilaerTextIsDisplayed()
	{
		return actionshelftrailertext.isDisplayed();
	}
	
	
	public boolean VaildateActionShelfWatchTrailerButtonIsDisplayed()
	{
		return actionshelfwatchtrailerbutton.isDisplayed();
	}
	
	
	
    public boolean ValidateChannelLeftSwipeButtonIsDisplayed()
    {
    	return channelleftswipebutton.isDisplayed();
    }
    
    
    public boolean ValidateChannelRightSwipeButtonIsDisplayed()
    {
    	return channelrightswipetbutton.isDisplayed();
    }


     public LiveTvPage ValidateClickOnLiveTv()
     {
    	 livetv.click();
    	 return new LiveTvPage();
     }
     
     
     public MoviesPage ValidateClickonMovies()
     {
    	 movies.click();
    	 return new  MoviesPage();
     }
     
     public GenresPage ValidateClickOnGenres()
     {
    	 genres.click();
    	 return new GenresPage();
     }
     
     
     public WatchlistsPage ValidateClickOnWatchLists()
     {
    	 watchlists.click();
    	 return new WatchlistsPage();
     }
     
     
     public Search ValidateClickonSearch()
     {
    	 search.click();
    	 return new Search();
     }
     
     
     public LogInPage ValidateClickOnlogInPage()
     { 
    	 login.click();
    	 return new LogInPage();
    	 
     }



}
	

