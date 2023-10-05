package com.DemoProject1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement maleRadioBtn;
	
	@FindBy(xpath="//input[@id='gender-female']")
	private WebElement femaleRadioBtn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstNameTextBox;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastNametextBox;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement RegisterBtn;
	
	@FindBy(xpath="//a[@href='/login']")
	private WebElement loginBtn;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNametextBox() {
		return lastNametextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Business Library
	public void clickOnMaleRadioBtn()
	{
		maleRadioBtn.click();
	}
	
	public void clickOnFemaleRadioBtn()
	{
		femaleRadioBtn.click();
	}
	
	public void EnterFirstName(String firstname)
	{
		firstNameTextBox.sendKeys(firstname);
	}
	
	public void EnterLastName(String lastname)
	{
		lastNametextBox.sendKeys(lastname);
	}
	
	public void EnterEmail(String email)
	{
		emailTextBox.sendKeys(email);
	}
	
	public void EnterPasswordAndConfirmPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
		confirmPasswordTextBox.sendKeys(pwd);
	}
	
	public void clickOnRegisterBtn()
	{
		RegisterBtn.click();
	}
	
}
