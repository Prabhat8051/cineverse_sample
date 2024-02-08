package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class WatchlistsPage extends CineverseBase {
	
	
	//Object Repository
	
	@FindBy(xpath="//h2[text()='Please Login / Sign Up to View Your Watchlist.']")
	WebElement loginsignuptext;
	
	
	public WatchlistsPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidateLogInSignUpTextisDisplayed()
	{
		return loginsignuptext.isDisplayed();
	}
	
	

}
