package com.SAPUI5.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SAPUI5.base.TestBase;
import com.SAPUI5.pages.CategoriesPage;
import com.SAPUI5.pages.HomePage;
import com.SAPUI5.utilityActions.TestUtil;

public class CategoriesPageTest extends TestBase {

	// ShoppingPage shopPageObj;
	HomePage homePageObj;
	TestUtil testUtilObj;
	CategoriesPage categoriesPageObj;

	public CategoriesPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {

		initialization();
		homePageObj = new HomePage();
		testUtilObj = new TestUtil();
		homePageObj.clickOnPopUp();
		homePageObj.clickOnShoppingCartLink();
		testUtilObj.switchToChildWindowShoppingPage();
		categoriesPageObj = new CategoriesPage();
	}

	/*
	 * @Test public void countOfCategoryItem() {
	 * 
	 * categoriesPageObj.countNoOfCategoryItems(); int
	 * noOfItems=categoriesPageObj.countTotalNoOfCategoryItems();
	 * 
	 * for (int i=0;i<noOfItems;i++) { System.out.print("["+i+"] ");
	 * System.out.print(categoriesPageObj.toPrintEachItemTitle(i)+" ");
	 * System.out.println(categoriesPageObj.toPrintEachItemTitleCount(i)); } }
	 */

	@Test(priority = 1)
	public void clickOnCategoryItem() throws InterruptedException {
		/*
		 * testUtilObj.waitForElementToBeVisible(categoriesPageObj.GraphicsCardItems);
		 * //categoriesPageObj.clickOnGraphicsCardItem();
		 * categoriesPageObj.clickOnCategoryItem(categoriesPageObj.GraphicsCardItems);
		 * testUtilObj.waitForElementToBeVisible(categoriesPageObj.backButton);
		 * categoriesPageObj.clickOnBackButton();
		 * 
		 * categoriesPageObj.clickOnCategoryItem(categoriesPageObj.miceItemElement);
		 * testUtilObj.waitForElementToBeVisible(categoriesPageObj.backButton);
		 * categoriesPageObj.clickOnBackButton();
		 */

		
		//adding Telecommunication product into cart and proceeding to checkout page
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.telecommunicationElement);
		categoriesPageObj.clickOnCategoryItem(categoriesPageObj.telecommunicationElement);
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.TelecomProductWirelessDSLRouter);
		categoriesPageObj.clickOnCategoryItem(categoriesPageObj.TelecomProductWirelessDSLRouter);
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.addToCartButton);
		testUtilObj.clickOnButton(categoriesPageObj.addToCartButton);
		categoriesPageObj.clickOnBackButton();
		
		// Mice Item to add into cart
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.miceItemElement);
		categoriesPageObj.clickOnCategoryItem(categoriesPageObj.miceItemElement);
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.Mousepad);
		categoriesPageObj.clickOnCategoryItem(categoriesPageObj.Mousepad);
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.addToCartButton);
		testUtilObj.clickOnButton(categoriesPageObj.addToCartButton);
		

		testUtilObj.waitForElementToBeVisible(categoriesPageObj.msg);
		testUtilObj.clickOnButton(categoriesPageObj.CartIcon);
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.Proceed);
		testUtilObj.clickOnButton(categoriesPageObj.Proceed);
	}

//	@Test(priority = 2)
//	public void addToCartMethod(){
//		testUtilObj.clickOnButton(categoriesPageObj.addToCartButton);
//		testUtilObj.waitForElementToBeVisible(categoriesPageObj.msg);
//		testUtilObj.clickOnButton(categoriesPageObj.CartIcon);
//		testUtilObj.waitForElementToBeVisible(categoriesPageObj.Proceed);
//		testUtilObj.clickOnButton(categoriesPageObj.Proceed);
//	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
		System.out.println("done");
	}
}
