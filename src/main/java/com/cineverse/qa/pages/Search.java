package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class Search  extends CineverseBase{
	
	//Object Repository
	
	@FindBy(xpath="//input[@class='searchbox_searchbox_input_textbox__Rh1eq']")
	WebElement searchinputbox;
	
	
	
	
	public Search ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidateSearchInputBoxIsDisplayed()
	{
		 return searchinputbox.isDisplayed();
	}

}
