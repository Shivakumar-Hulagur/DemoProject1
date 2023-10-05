package com.DemoProject.TestScripts;

import org.testng.annotations.Test;

import com.DemoProjec1.generic.BaseTest;
import com.DemoProject1.pom.HomePage;

public class VerifyAddToCartTest extends BaseTest {

	@Test
	public void addToCartComputers()
	{
		HomePage HomePageInstance = new HomePage(driver);
		HomePageInstance.addToCart("Build your own cheap computer");
	}
}
