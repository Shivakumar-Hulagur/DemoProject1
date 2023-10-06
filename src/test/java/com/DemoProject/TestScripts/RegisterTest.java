package com.DemoProject.TestScripts;


import org.testng.annotations.Test;
import com.DemoProjec1.generic.BaseTest;
import com.DemoProject1.pom.HomePage;
import com.DemoProject1.pom.RegisterConfirmationPage;
import com.DemoProject1.pom.RegisterPage;

public class RegisterTest extends BaseTest
{
	
	@Test
	public void RegisterintoApplication()
	{
		//step01- Go to home page click on register link
		HomePage hp=new HomePage(driver);
		hp.ClickOnRegisterLink();
		
		//step02- Register by entering your details
		RegisterPage rp=new RegisterPage(driver);
		rp.clickOnMaleRadioBtn();
		rp.EnterFirstName("sumukh");
		rp.EnterLastName("gs");
		rp.EnterEmail("sumukh@gmail.com");
		rp.EnterPasswordAndConfirmPassword("password@123");
		
		//step03 click on continue button
		RegisterConfirmationPage rcp=new RegisterConfirmationPage(driver);
	    rcp.clickOnContinueBtn();
			
	
		
	}

}
