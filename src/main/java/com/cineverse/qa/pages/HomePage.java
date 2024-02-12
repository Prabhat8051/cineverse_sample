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
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[1]")
	WebElement docurama;
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[2]")
	WebElement thefilmdetective;
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[3]")
	WebElement contv;
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[4]")
	WebElement soreal    ;
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[5]")
	WebElement sodramatic   ;
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[6]")
	WebElement thethreestooges;
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[7]")
	WebElement  asiancrush ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[8]")
	WebElement fandor ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[9]")
	WebElement  dovechannel;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[10]")
	WebElement  gustotv  ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[11]")
	WebElement retrocrush    ;
	
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[12]")
	WebElement comedydynamics;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[13]")
	WebElement   theelvispresleychannel ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[14]")
	WebElement thebobrosschannel ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[15]")
	WebElement midnightpulp  ;
	
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[16]")
	WebElement  screambox;
	
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[17]")
	WebElement  elreynetwork ;
	
	
	
	@FindBy(xpath="(//div[@class='cineverse_item_holder curson-pointer'])[18]")
	WebElement  lonestar   ;
	
	

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



     // Validating Channels are visible on home screen or not
     
     
     public boolean ValidateDocuramaIsDisplayed()
     {
    	 return docurama.isDisplayed();
     }
     
     
     public boolean ValidateTheFilmDetectiveIsDisplayed()
     {
    	 return thefilmdetective.isDisplayed();
     }
     
     
     public boolean ValidateConTvIsDisplayed()
     {
    	 return contv.isDisplayed();
     }
     
     
     public boolean ValidateSoRealIsDisplayed()
     {
    	 return soreal.isDisplayed();
     }
     
     
     public boolean ValidateSoDramaticIsDisplayed()
     {
    	 return sodramatic.isDisplayed();
     }
     
     
     public boolean ValidateTheThreeStoogesIsDisplayed()
     {
    	 return thethreestooges.isDisplayed();
     }
     
     
     public boolean ValidateAsianCrushIsDisplayed()
     {
    	 return asiancrush.isDisplayed();
     }
     
     
     public boolean ValidateFandorIsDisplayed()
     {
    	 return fandor.isDisplayed();
     }
     
     
     public boolean ValidateDoveChannelIsDisplayed()
     {
    	 return dovechannel.isDisplayed();
     }
     
     
     
     public boolean ValidateGustoTvIsDisplayed()
     {
    	 return gustotv.isDisplayed();
    	 
     }
     
     
     public boolean ValidateRetroCrushIsDisplayed()
     {
    	 return retrocrush.isDisplayed();
     }
     
     
     
     public boolean ValidateComedyDynamicsIsDisplayed()
     {
    	 return comedydynamics.isDisplayed();
     }
     
     
     public boolean ValidateTheElvisPresleyChannelIsDisplayed()
     {
    	 return theelvispresleychannel.isDisplayed();
     }
     
     public boolean ValidateTheBobRossChannelIsDisplayed()
     {
    	 return thebobrosschannel.isDisplayed();
     }
     
     
     public boolean ValidateMidNightPulpIsDiplayed()
     {
    	 return midnightpulp.isDisplayed();
     }
     
     
     
     public boolean ValidateScreamBoxIsDisplayed()
     {
    	 return screambox.isDisplayed();
     }
     
     
     public boolean ValidateElreyNetwork()
     {
    	 return elreynetwork.isDisplayed();
     }
     
     
     public boolean ValidateLoneStarIsDisplayed()
     {
    	 return lonestar.isDisplayed();
     }
     
     
     
     
     
     
     
     
}
	

