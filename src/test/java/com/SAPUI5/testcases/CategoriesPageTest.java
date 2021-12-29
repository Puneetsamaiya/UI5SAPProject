package com.SAPUI5.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SAPUI5.base.TestBase;
import com.SAPUI5.pages.CategoriesPage;
import com.SAPUI5.pages.HomePage;
import com.SAPUI5.utilityActions.TestUtil;

public class CategoriesPageTest extends TestBase{

	//ShoppingPage shopPageObj;
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
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.GraphicsCardItems);
		categoriesPageObj.clickOnGraphicsCardItem();
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.backButton);
		categoriesPageObj.clickOnBackButton();
	}
	
	/*
	 * @Test(priority = 2) 
	 * public void clickOnBackCategory() {
	 * categoriesPageObj.clickOnBackButton(); }
	 */	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		System.out.println("done");
	}
}
