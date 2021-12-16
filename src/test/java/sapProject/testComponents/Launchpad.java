package sapProject.testComponents;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ShoppingPage;
import utilityActions.utilityActionsOnElements;

public class Launchpad {

	HomePage basePage = new HomePage();
	utilityActionsOnElements utilObjects = new utilityActionsOnElements();
	ShoppingPage shopPage = new ShoppingPage();
	
	@BeforeTest
	public void setup() {
		utilObjects.goToURL();
	}
	
		
	@Test
	public void launchTest() throws InterruptedException{
		
		utilObjects.waitForElementToBeClickable(basePage.acceptAll_button);
		utilObjects.doClick(basePage.acceptAll_button);
		utilObjects.waitForElementToBeClickable(basePage.shoppingCartLink);
		utilObjects.doClick(basePage.shoppingCartLink);
		
		
//		System.out.println(shopPage.expectedTitle);
//		System.out.println(utilObjects.getTitleOfThePage());
//		utilObjects.switchToChildWindowShoppingPage();
		Assert.assertEquals(shopPage.expectedTitle, utilObjects.switchToChildWindowShoppingPage());
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		utilObjects.quitBrowser();
	}
}
