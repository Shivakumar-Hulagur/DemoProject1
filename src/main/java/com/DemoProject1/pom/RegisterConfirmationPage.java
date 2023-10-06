package com.DemoProject1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterConfirmationPage {
	
	@FindBy(xpath="//input[@class='button-1 register-continue-button']")
	private WebElement continueBtn;
	
	public RegisterConfirmationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinueBtn()
	{
		continueBtn.click();
	}

}
