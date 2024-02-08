package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class LiveTvPage extends CineverseBase {
	
	//Object Reporsitory
	
	@FindBy(xpath="//img[@alt='LiveText']")
	WebElement livetext;
	
	
	
	public LiveTvPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidateLiveTextIsDisplayed()
	{
		 return livetext.isDisplayed();
	}

}
