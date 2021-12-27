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

public class ShoppingPageTest extends TestBase{

	//TestUtil utilObjects = new TestUtil();
	//HomePageTest homePageTest = new HomePageTest();
	ShoppingPage shopPageObj;
	HomePage homePageObj;
	TestUtil testUtilObj;
	
	public ShoppingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		homePageObj = new HomePage();
		
		testUtilObj = new TestUtil();
		
		homePageObj.clickOnPopUp();
		homePageObj.clickOnShoppingCartLink();
		
		shopPageObj = new ShoppingPage();
	}
	

	@Test(priority =2)
	public void verifyTitleOfThePage() throws InterruptedException {
		testUtilObj.switchToChildWindowShoppingPage();
		Assert.assertEquals(driver.getTitle(), shopPageObj.expectedTitle);
	}
	
	
	@Test(priority =1)
	public void verifyShoppingWelcomeText() throws InterruptedException{
		testUtilObj.switchToChildWindowShoppingPage();
		 testUtilObj.waitForElementToBeVisible(shopPageObj.welcomeText);
		Assert.assertTrue(shopPageObj.verifyWelcomeText());
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
}
