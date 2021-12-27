package com.SAPUI5.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SAPUI5.base.TestBase;
import com.SAPUI5.pages.HomePage;
import com.SAPUI5.pages.ShoppingPage;
import com.SAPUI5.utilityActions.TestUtil;

public class HomePageTest extends TestBase{
	
	HomePage homePageObj;
	TestUtil testUtilObj;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePageObj = new HomePage();
	}
	
	@Test
	public void validateHomePageTitle() {
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "SAPUI5 SDK - Demo Kit");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
