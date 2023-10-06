
	package com.DemoProject1.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		WebDriver driver;
	@FindBy(id = "Email")
	private WebElement emailTbx;
	@FindBy(id="Password")
	private WebElement passwordTbx;
	@FindBy(id="RememberMe")
	private WebElement rememberMeCheckBx;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailTbx() {
		return emailTbx;
	}

	public WebElement getPasswordTbx() {
		return passwordTbx;
	}

	public WebElement getRememberMeCheckBx() {
		return rememberMeCheckBx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	// Business Libraries

	public void loginAsUser(String email,String password) {
		getEmailTbx().sendKeys(email);
		getPasswordTbx().sendKeys(password);
		getLoginBtn().click();
	}
	}


