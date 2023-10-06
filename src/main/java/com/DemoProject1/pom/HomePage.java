package com.DemoProject1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage {

	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(xpath="//ul[@class='top-menu']/descendant::a[normalize-space(text())='Computers']")
	private WebElement computersDropDown;
	
	@FindBy(xpath ="//ul[@class='sublist firstLevel active']//a[normalize-space(text())='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath ="//ul[@class='sublist firstLevel active']//a[normalize-space(text())='Notebooks']")
	private WebElement notebooks;
	
	@FindBy(xpath ="//ul[@class='sublist firstLevel active']//a[normalize-space(text())='Accessories']")
	private WebElement accessories;
	
	@FindBy(xpath ="//a[text()='Build your own cheap computer']/ancestor::div[@class='product-item']/descendant::input[@value='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='overview']//input[@value='Add to cart']")
	private WebElement addToCartButtonInCartPage;
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//a[@class='product-name']")
	private WebElement nameOfAddedProductToCart;
	
	@FindBy(xpath="//a[@title='Show products in category Desktops' and normalize-space( text())='Desktops']")
	private WebElement desktopLink;
	
	//Login Page constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Business Libraries
	
	public void addToCart(String expProduct)
	{
		computersDropDown.click();
		desktops.click();
		desktopLink.click();
		addToCartButton.click();
		addToCartButtonInCartPage.click();
		shoppingCartLink.click();
		String actualProductName = nameOfAddedProductToCart.getText();
		Assert.assertEquals(actualProductName, expProduct);
	}
	

	public void ClickOnRegisterLink() {
		registerLink.click();
		
	}
	
	
	
	
}
