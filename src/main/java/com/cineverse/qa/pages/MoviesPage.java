package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class MoviesPage extends CineverseBase {
	
	
	//Object Repository
	
	@FindBy(xpath="//img[@alt='Promo Title Image']")
	WebElement promotitle;
	
	
	
	
	
	
	public MoviesPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidatePromoTitleIsDisplayed()
	{
		return promotitle.isDisplayed();
	}
	

}
