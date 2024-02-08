package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class GenresPage extends CineverseBase {
	
	//Object Repository
	
	@FindBy(xpath="(//img[@alt='Arrow'])[1]")
	WebElement genresleftarrowbutton;
	
	
	
	
	public GenresPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean ValidateGenresLeftArrowButtonIsDisplayed()
	{
		 return genresleftarrowbutton.isDisplayed();
	}
	
	

}
