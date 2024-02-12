package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class ForgotPasswordPage extends CineverseBase {
	
	
	
	//Object Reporsitory
	
	@FindBy(xpath="//h2[text()='Please enter your registered Email ID']")
	WebElement pleaseentertext;
	
	@FindBy(xpath="//input[@class='sc-3d62c686-0 jCVIMG']")
	WebElement emailinputfield;
	
	@FindBy(xpath="//button[@class='sc-17708cd3-0 ieldRr']")
	WebElement submitbutton;
	
	
	
	
	public ForgotPasswordPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public String ValidatePleaseEnterText()
	{
		String entertext=pleaseentertext.getText();
		return entertext;
	}
	
	
	
	public boolean ValidateEmailInputFieldIsDisplayed()
	{
		return emailinputfield.isDisplayed();
	}
	
	
	
	public boolean ValidateSubmitButtonIsDisplayed()
	{
		return submitbutton.isDisplayed();
	}
	
	
	
	
	
	
	
	

}
