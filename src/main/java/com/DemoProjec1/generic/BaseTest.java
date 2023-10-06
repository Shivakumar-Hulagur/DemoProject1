package com.DemoProjec1.generic;

import java.time.Duration;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{

	public  static WebDriver driver=null;

	@BeforeClass
	public void configBC()
	{
		//Launching chrome browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//Triggering url
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void configAC()
	{
		driver.quit();
	}
}
