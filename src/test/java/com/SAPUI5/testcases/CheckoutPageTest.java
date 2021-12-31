package com.SAPUI5.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SAPUI5.base.TestBase;
import com.SAPUI5.pages.CategoriesPage;
import com.SAPUI5.pages.CheckoutPage;
import com.SAPUI5.pages.HomePage;
import com.SAPUI5.utilityActions.TestUtil;

public class CheckoutPageTest extends TestBase{

	public CheckoutPageTest() {
		super();
	}

	HomePage homePageObj;
	TestUtil testUtilObj;
	CategoriesPage categoriesPageObj;
	CheckoutPage checkOutPageObj;
	CategoriesPageTest categoryTestObj;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		checkOutPageObj = new CheckoutPage();
		homePageObj = new HomePage();
		testUtilObj = new TestUtil();
		homePageObj.clickOnPopUp();
		homePageObj.clickOnShoppingCartLink();
		testUtilObj.switchToChildWindowShoppingPage();
		categoriesPageObj = new CategoriesPage();
		categoryTestObj = new CategoriesPageTest();
	}
	
	@Test
	public void validateCheckOutTextTest() throws InterruptedException {
	
		categoryTestObj.clickOnCategoryItem();
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.checkoutText);
		Assert.assertTrue(testUtilObj.textIsVisible(checkOutPageObj.checkoutText));
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("checkOutPageDone");
	}
	
}
