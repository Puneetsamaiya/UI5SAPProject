package com.SAPUI5.testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SAPUI5.base.TestBase;
import com.SAPUI5.pages.CategoriesPage;
import com.SAPUI5.pages.CheckoutPage;
import com.SAPUI5.pages.EditItemsFromCart;
import com.SAPUI5.pages.HomePage;
import com.SAPUI5.pages.OrderCompleted;
import com.SAPUI5.pages.OrderSummary;
import com.SAPUI5.utilityActions.TestUtil;

public class CategoriesPageTest extends TestBase {

	// ShoppingPage shopPageObj;
	HomePage homePageObj;
	TestUtil testUtilObj;
	CategoriesPage categoriesPageObj;
	CheckoutPage checkOutPageObj;
	EditItemsFromCart editItemsObj;
	OrderSummary orderSummaryObj;
	OrderCompleted orderCompletedObj;
	
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
		checkOutPageObj = new CheckoutPage();
		editItemsObj = new EditItemsFromCart();
		orderSummaryObj  = new OrderSummary();
		orderCompletedObj = new OrderCompleted();
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
//		testUtilObj.waitForElementToBeVisible(categoriesPageObj.telecommunicationElement);
//		testUtilObj.clickOnButton(categoriesPageObj.telecommunicationElement);
//		
//		testUtilObj.waitForElementToBeVisible(categoriesPageObj.TelecomProductWirelessDSLRouter);
//		testUtilObj.clickOnButton(categoriesPageObj.TelecomProductWirelessDSLRouter);
//		
//		testUtilObj.waitForElementToBeVisible(categoriesPageObj.addToCartButton);
//		testUtilObj.clickOnButton(categoriesPageObj.addToCartButton);
//		categoriesPageObj.clickOnBackButton();
		
		// Mice Item to add into cart
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.miceItemElement);
		categoriesPageObj.clickOnCategoryItem(categoriesPageObj.miceItemElement);
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.Mousepad);
		testUtilObj.clickOnButton(categoriesPageObj.Mousepad);
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.addToCartButton);
		testUtilObj.clickOnButton(categoriesPageObj.addToCartButton);
		

		testUtilObj.waitForElementToBeVisible(categoriesPageObj.msg); // pop up for product is added
		testUtilObj.clickOnButton(categoriesPageObj.CartIcon);
		

		
//		//Delete item from the cart section
//		testUtilObj.clickOnButton(editItemsObj.editButton);
//		
//		testUtilObj.waitForElementToBeVisible(editItemsObj.saveChangesButton);
//		
//		testUtilObj.clickOnButton(editItemsObj.deleteMousePadItem);
//		
//		testUtilObj.waitForElementToBeVisible(editItemsObj.confirmationPopUpDeleteButton);
//		testUtilObj.clickOnButton(editItemsObj.confirmationPopUpDeleteButton);
//		testUtilObj.waitForElementToBeVisible(editItemsObj.msgForRemoveItem);  // pop up for product is removed from the cart
//		
//		testUtilObj.clickOnButton(editItemsObj.saveChangesButton);
		
		//checkout page
		
		testUtilObj.waitForElementToBeVisible(categoriesPageObj.Proceed); // this is proceed button for checkout
		testUtilObj.clickOnButton(categoriesPageObj.Proceed);
		
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.checkoutText);
		Assert.assertTrue(testUtilObj.textIsVisible(checkOutPageObj.checkoutText));
		
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.step2Button);
		testUtilObj.clickOnButton(checkOutPageObj.step2Button);
		System.out.println("step 2 button");
		
		
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.paymentTypeText);
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.bankTransferButton);
		Thread.sleep(2000);
		testUtilObj.clickOnButton(checkOutPageObj.bankTransferButton);
		System.out.println("bank transfer button");
		
		testUtilObj.clickOnButton(checkOutPageObj.step3Button);
		System.out.println("step 3 button");
		
		
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.step4Button);
		testUtilObj.clickOnButton(checkOutPageObj.step4Button);
		System.out.println("step 4 button");
		//Invoice Address
		//Thread.sleep(2000);
		testUtilObj.waitForElementToBeClickable(checkOutPageObj.textForDelivery);
		//testUtilObj.waitForElementToBeVisible(checkOutPageObj.textForDelivery);
		checkOutPageObj.invoiceAddress.sendKeys("Mohan Nagar Sagar");
		checkOutPageObj.invoiceCity.sendKeys("Sagar");
		checkOutPageObj.invoiceCountry.sendKeys("Bharat");
		checkOutPageObj.invoiceZip.sendKeys("1234");
		checkOutPageObj.invoiceNotes.sendKeys("This is invoice and Delivery add");

		testUtilObj.waitForElementToBeVisible(checkOutPageObj.step5Button);
		testUtilObj.clickOnButton(checkOutPageObj.step5Button);
		
		testUtilObj.waitForElementToBeClickable(driver.findElement(By.id("container-cart---checkoutView--deliveryTypeStep")));
		testUtilObj.waitForElementToBeVisible(checkOutPageObj.expressButton);
		testUtilObj.waitForElementToBeClickable(checkOutPageObj.expressButton);
		testUtilObj.clickOnButton(checkOutPageObj.expressButton);
		testUtilObj.clickOnButton(checkOutPageObj.orderSummaryButton);
		
		//OrderSummary
		testUtilObj.waitForElementToBeVisible(orderSummaryObj.submitButton);
		testUtilObj.waitForElementToBeClickable(orderSummaryObj.submitButton);
		//testUtilObj.waitForElementToBeVisible(orderSummaryObj.submitButton);
		testUtilObj.clickOnButton(orderSummaryObj.submitButton);
		
		testUtilObj.waitForElementToBeClickable(orderSummaryObj.confirmationCheckoutYesButton);
		//testUtilObj.waitForElementToBeVisible(orderSummaryObj.confirmationCheckoutYesButton);
		testUtilObj.clickOnButton(orderSummaryObj.confirmationCheckoutYesButton);
		System.out.println("Everything is done");
		Thread.sleep(2000);
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
		 driver.quit();
		//System.out.println("done");
	}
}
