package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class LogInPage extends CineverseBase {
	
	//Object Repository
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected inner-tabs css-1q2h7u5']")
	WebElement loginbutton;
	
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean ValidateLoginButtonIsDisplayed()
	{
		return loginbutton.isDisplayed();
	}
	
	

}
